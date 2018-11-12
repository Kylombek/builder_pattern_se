package builder;
import composite.Component;

/**
 * Basic cake class
 */
public abstract class Cake extends Component {
    private String flour;
    private boolean sugar = false;
    private String name;

    public Cake(String name) {
        this.name = name;
    }

    public boolean withSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public abstract int getPrice();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlour() {
        return flour;
    }

    void setFlour(String flour) {
        this.flour = flour;
    }





    @SuppressWarnings("Duplicates")
    public void display() {
        StringBuilder sb = new StringBuilder();
        System.out.println(name);
        if(flour!= null)
            sb.append("Flour : "+ getFlour() + "\n");

        if(sugar == true)
            sb.append("Sugar : YES" + "\n");
        else sb.append("Sugar : NO"+"\n");

        sb.append("Price : "+ getPrice());
        System.out.println(sb.toString());
    }
}
