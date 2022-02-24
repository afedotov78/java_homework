public class RectangularPizza extends Pizza {
    private double price;
    private String name;
    private double a;
    private double b;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public RectangularPizza(double price, String name, double a, double b) {
        super(price, name);
        this.a = a;
        this.b = b;
    }

    public double getSquare(){
        return a * b;
    }
    public double pricePerUnit(){
        return price / getSquare();
    }

    @Override
    public String toString() {
        return "RectangularPizza{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
