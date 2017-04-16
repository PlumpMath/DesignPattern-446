public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        }
        else {
            return null;
        }
    }
}
