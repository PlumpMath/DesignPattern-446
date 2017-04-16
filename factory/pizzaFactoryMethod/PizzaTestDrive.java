public class PizzaTestDrive {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();
        NYPizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
