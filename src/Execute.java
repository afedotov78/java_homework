public class Execute {
    public static void main(String[] args) {

        Sphere one  = new Sphere(7);
        Cuboid two = new Cuboid(2, 3, 4);

        System.out.println(one.getVolume());
        System.out.println(one.getSurfaceArea());
        System.out.println(two.getVolume());
        System.out.println(two.getSurfaceArea());

//        UsualPizza margarita = new UsualPizza(30, 300, "Margarita");
//        UsualPizza fourCheese = new UsualPizza(50, 700, "Four Cheeses");
//        UsualPizza pepperoni = new UsualPizza(40,  600,  "Pepperoni");
//
//        margarita.printInfo();
//        fourCheese.printInfo();
//        pepperoni.printInfo();
//
//        UsualPizza[] pizzas = {new UsualPizza(30, 300, "Margarita"),
//                new UsualPizza(50, 700, "Four Cheeses"),
//                new UsualPizza(40, 600, "Pepperoni")};
//
//        UsualPizza bestUsualPizza = pizzas[0];
//
//        for (UsualPizza curPizza : pizzas) {
//            if (bestUsualPizza.pricePerUnit() > curPizza.pricePerUnit()) {
//                bestUsualPizza = curPizza;
//
//
//                CircularPizza[] pizzas = {new CircularPizza(30, 300, "Margarita"),
//                new CircularPizza(50, 700, "Four Cheeses"),
//                new CircularPizza(40, 600, "Pepperoni")};
//
//        CircularPizza bestPizza = pizzas[0];
//
//                for (CircularPizza curPizza : pizzas) {
//                    if (bestPizza.pricePerUnit () > curPizza.pricePerUnit()) {
//                        bestPizza = curPizza;
//                    }
//                }
//
//                System.out.println("Today we order: ");
//                System.out.println(bestUsualPizza);
//
        QuadraticEquation example1 = new QuadraticEquation(5, 7.5, 9);
        example1.printRoots();
//            }
//        }
    }
}