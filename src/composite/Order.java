package composite;


import java.util.ArrayList;
import java.util.List;

public class Order extends Component{
    List<Component> order = new ArrayList<>();

    @Override
    public void add(Component cake) {
        order.add(cake);
    }

    @Override
    public void remove(Component cake) {
        order.remove(cake);
    }

    @Override
    public void display() {
        System.out.println("Your order is :");
        for(Component cake : order){
            cake.display();
        }
        System.out.println("Total price :" + getPrice() );
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for(Component cake : order){
            sum+= cake.getPrice();
        }
        return sum;
    }
}
