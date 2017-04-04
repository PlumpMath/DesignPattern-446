public interface Subject {
    // 注册『观察者』
    public void registerObserver(Observer o);

    // 注销『观察者』
    public void removeObserver(Observer o);

    // 『主题』状态改变时通知所有『观察者』
    public void notifyObservers();

}
