import builder.*;
import composite.Component;
import composite.Order;
import decorator.CakeWithNuts;
import mediator.Cashier;
import mediator.Client;
import mediator.User;

/**
 * authors : Mavlianov Kylym, Majitova Jamilya, Dzhumabekova Aisuluu, Kasymbekov Nursultan AIN-2-17
 * version: 11/11/2018
 */
public class Main {
    public static void main(String[] args) {
        //creating a baker, and his receipts
         Baker baker = new Baker();
         CakeBuilder chocoCakeBuilder = new ChocoCakeBuilder();
         CakeBuilder cherryCakeBuilder = new CherryCakeBuilder();

        //baking chocolate cake
         baker.bakeWithSugar(chocoCakeBuilder);
         Cake chocoCake = chocoCakeBuilder .getCake();


         //baking cherry cake with sugar
         baker.bake(cherryCakeBuilder);
         Cake cherryCake = cherryCakeBuilder.getCake();
          cherryCake = new CakeWithNuts(cherryCake);

            //making an order
         Component order1 = new Order();
         order1.add(chocoCake);
         order1.add(cherryCake);

            //creating a cashier and a client
         Cashier cashier = new Cashier();
         User client1 = new Client("Aisuluu");

        //cashier adds a client and gives him an order and a bill
         cashier.addUser(client1);
         cashier.sendOrder(order1, client1);



    }


}
