package builder;

/**
 * Concrete builder for chocolate cake
 */
public class ChocoCakeBuilder implements CakeBuilder {
    private Cake cake;
    public ChocoCakeBuilder() {
         cake = new ChocoCake();
    }
    @Override
    public void setSugar() {
        cake.setSugar(true);
    }

    @Override
    public void setFlour() {
        cake.setFlour ("Chocolate flour");
    }


    @Override
    public Cake getCake() {
        return cake;
    }
}
