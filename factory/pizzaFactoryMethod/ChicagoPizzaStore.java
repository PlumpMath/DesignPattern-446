public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }
        else {
            return null;
        }
    }
}
