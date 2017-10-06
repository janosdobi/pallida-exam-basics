package CandyShop;

public class Sweets {

    protected double price;
    protected int sugar;
    protected String name;

    public Sweets (String name) {
        this.name = name;
        if (name.equals("candy")) {
            this.price = 20.0;
            this.sugar = 10;
        } else if (name.equals("lollipop")) {
            this.price = 10.0;
            this.sugar = 5;
        }
    }

    public void raisePrice(double percentage) {
        this.price += this.price * percentage / 100.0;
    }

}