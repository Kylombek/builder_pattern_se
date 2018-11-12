package mediator;

import composite.Component;
import composite.Order;

public class Client extends User {

    public Client(String name) {
        super( name);
    }

    @Override
    public void receive(Component ord) {
        System.out.println(this.name+" got the order :");
        ord.display();
    }
}
