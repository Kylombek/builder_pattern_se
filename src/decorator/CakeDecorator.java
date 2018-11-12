package decorator;

import builder.Cake;

public abstract class CakeDecorator extends Cake {
    protected Cake cake;

    public CakeDecorator(String name, Cake cake) {
        super(name);
        this.cake = cake;
    }
}
