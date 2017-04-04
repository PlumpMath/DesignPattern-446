public interface Observer {
    // 当『主题』的状态值改变时，『主题』会把新的状态作为undate方法的参数传给所有观察者
    public void update(float temp, float humidity, float pressure);
}
