package builder;

public class ChocoCake extends Cake {
    public ChocoCake() {
        super("Chocolate cake");
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
