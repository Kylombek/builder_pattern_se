package mediator;

import composite.Component;
import composite.Order;

public abstract class User {

    protected String name;

    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public abstract void receive(Component ord);
}
