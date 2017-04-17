public class LightOffCommand implements Command {
    Light light;
    int prevLevel;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.off(); // light的off方法调用时prevLevel设为0
    }

    public void undo() {
        light.dim(prevLevel);
    }
}
