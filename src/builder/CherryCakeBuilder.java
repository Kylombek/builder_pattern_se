package builder;

/**
 * Concrete builder for cherry cake
 */
public class CherryCakeBuilder implements CakeBuilder {
    private Cake cake = new CherryCake();

    @Override
    public void setSugar() {
        cake.setSugar(true);
    }

    @Override
    public void setFlour() {
        cake.setFlour ( "Wheat flour");
    }

    @Override
    public Cake getCake() {
        return cake;
    }
}
