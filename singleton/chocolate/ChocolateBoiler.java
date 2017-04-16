public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // 单例模式需要一个类私有变量
    private static ChocolateBoiler uniqueInstance;

    // 单例模式的构造函数为私有
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // 单例模式获取实例的方法
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("creating...");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("returning...");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
