package decorator;

import builder.Cake;

    public class CakeWithNuts extends CakeDecorator {
    private static final int NUT_PRICE = 10;

    public CakeWithNuts(Cake cake) {
        super(cake.getName() + ", with Nuts", cake);
    }

        @Override
        public int getPrice() {
            return cake.getPrice() + NUT_PRICE;
        }
    }
