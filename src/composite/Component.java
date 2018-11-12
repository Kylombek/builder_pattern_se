package composite;

/**
 * This is component of Order. It implements Composite design pattern.
 */
public abstract class Component {
    public Component() {
    }
    public  void add(Component component){}
    public  void remove(Component component){}
    public  void display(){}
    public  abstract int getPrice();

}
