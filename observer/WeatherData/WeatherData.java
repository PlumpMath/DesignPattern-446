import java.util.ArrayList;

public class WeatherData implements Subject {
    // 使用ArrayList来记录所有观察者
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    // 实现Subject接口

    // 注册观察者时将其加到ArrayList后面即可
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 注销观察者时将其从ArrayList中删除即可
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    // 『推送』新状态给所有观察者
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }


    // 有了新状态后通知观察者
    public void measurementsChanged() {
        notifyObservers();
    }

    // 自定义测试方法
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
