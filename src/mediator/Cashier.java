package mediator;

import composite.Component;
import composite.Order;

import java.util.ArrayList;
import java.util.List;

public class Cashier implements ICashier {
    private List<User> users;

    public Cashier(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendOrder(Component ord, User user) {
        for(User u : this.users){
            if(u == user)
                u.receive(ord);
        }
    }
}
