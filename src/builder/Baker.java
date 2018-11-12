package builder;
/**
        Director class (Builder design pattern)
 */
public class Baker{
    public void bake(CakeBuilder builder) {
        builder.setFlour();
    }

    public void bakeWithSugar(CakeBuilder builder) {
        builder.setFlour();
        builder.setSugar();
    }

}