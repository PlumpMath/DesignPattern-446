public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater(); // 煮水
        brew(); // 冲泡
        pourInCup(); // 导入水杯
        addCondiments(); // 加入调料
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
