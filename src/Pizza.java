public abstract class Pizza {
    protected double price;
    protected String name;

    public Pizza(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract double getSquare();

    public abstract double pricePerUnit();
}
