// ConcreateProductA1: 微软系统的窗口
public class MSWindow implements Window {
    public void setTitle(String text) {
        System.out.println("MS Windows setTitle behaviour");
    }
    public void repaint() {
        System.out.println("MS Windows repaint behaviour");
    }
}
