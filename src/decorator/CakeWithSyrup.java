package decorator;

import builder.Cake;

public class CakeWithSyrup extends CakeDecorator {
    private static final int SYRUP_PRICE = 15;

    public CakeWithSyrup(Cake cake) {
        super(cake.getName() + ", with Syrup", cake);
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + SYRUP_PRICE;
    }
}
