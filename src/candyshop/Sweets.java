package candyshop;

public class Sweets {

    protected double price;
    protected int sugar;
    protected String name;

    public Sweets (String name) {
        this.name = name;
    }

    public void raisePrice(double percentage) {
        this.price += this.price * percentage / 100.0;
    }

}