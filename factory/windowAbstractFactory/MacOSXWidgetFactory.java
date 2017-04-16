// ConcreteFactory2: Mac OSX 部件工厂
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
    // create product A: Mac系统的窗口
    public Window createWindow() {
        MacOSXWindow window = new MacOSXWindow();
        return window;
    }
}
