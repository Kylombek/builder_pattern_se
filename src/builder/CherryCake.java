package builder;

public class CherryCake extends Cake {
    public CherryCake() {
        super("Cherry cake");
    }

    @Override
    public int getPrice() {
        return 90;
    }
}
