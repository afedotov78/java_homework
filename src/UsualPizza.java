public class UsualPizza {
    private double diameter;
    private double price;
    private String name;

    public double getDiameter() {

        return diameter;
    }
    public double getRadius() {

        return diameter / 2;
    }
    public double getSquare() {
        return getRadius() * getRadius() * Math.PI;
    }
    public double getPrice() {

        return price;
    }
    public String getName() {

        return name;
    }
    public UsualPizza(double diameter, double price, String name) {
        this.diameter = diameter;
        this.price = price;
        this.name = name;
    }
    public double pricePerUnit() {

        return price / getSquare();
    }
    public void printInfo() {
        System.out.println("Name: " + name + " price per unit: " + pricePerUnit());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "diameter=" + diameter +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
