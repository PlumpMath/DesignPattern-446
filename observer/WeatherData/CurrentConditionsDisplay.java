public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay() {}

    // 书上给的例子是在构造函数中注册，也可以手动注册
    public void register(WeatherData weatherData) {
        // 保存Subject的引用，便于后序取消注册
        this.weatherData = weatherData;
        // 在主题中注册
        weatherData.registerObserver(this);
    }

    // 实现Observer接口
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    // 实现DisplayElement接口
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
