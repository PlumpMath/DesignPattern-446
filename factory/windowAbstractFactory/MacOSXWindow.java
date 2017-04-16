// ConcreateProductA2: Mac系统的窗口
public class MacOSXWindow implements Window {
    public void setTitle(String text) {
        System.out.println("Mac OSX setTitle behaviour");
    }
    public void repaint() {
        System.out.println("Mac OSX repaint behaviour");
    }
}
