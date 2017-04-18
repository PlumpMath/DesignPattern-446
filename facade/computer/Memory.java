public class Memory {
    private String version;

    public Memory(String version) {
        this.version = version;
    }

    public void startup() {
        System.out.println(version + " memory is startup...\n");
    }

    public void shutdown() {
        System.out.println(version + " memory is shutdown...\n");
    }
}
