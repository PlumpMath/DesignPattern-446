// Client
public class GUIBuilder {
    private Window window;
    public void buildWindow(AbstractWidgetFactory widgetFactory) {
        this.window = widgetFactory.createWindow();
        this.window.setTitle("New Window");
    }

    public void repaintWindow() {
        this.window.repaint();
    }
}
