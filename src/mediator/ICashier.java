package mediator;

import composite.Component;
import composite.Order;

public interface ICashier {
    void sendOrder(Component ord, User user);
    void addUser(User user);
}
