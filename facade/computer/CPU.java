public class CPU {
    private String version;

    public CPU(String version) {
        this.version = version;
    }

    public void startup() {
        System.out.println(version + " CPU is startup...\n");
    }

    public void shutdown() {
        System.out.println(version + " CUP is shutdown...\n");
    }
}
