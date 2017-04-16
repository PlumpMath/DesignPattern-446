public class WindowTestDrive {
    public static void main(String[] args) {
        GUIBuilder builder = new GUIBuilder();
        AbstractWidgetFactory widgetFactory = null;

        // if you're on MS Windows
        widgetFactory = new MSWindowsWidgetFactory();
        builder.buildWindow(widgetFactory);
        builder.repaintWindow();

        // if you're on Mac OSX
        widgetFactory = new MacOSXWidgetFactory();
        builder.buildWindow(widgetFactory);
        builder.repaintWindow();
    }
}
