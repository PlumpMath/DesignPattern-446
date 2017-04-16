// ConcreateFactory1: MS Windows 部件工厂
public class MSWindowsWidgetFactory implements AbstractWidgetFactory {
    // create product A: 微软系统的窗口
    public Window createWindow() {
        MSWindow window = new MSWindow();
        return window;
    }
}
