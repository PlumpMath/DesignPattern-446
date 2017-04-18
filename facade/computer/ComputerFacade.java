public class ComputerFacade {
    private Memory memory;
    private CPU cpu;

    public ComputerFacade(Memory memory, CPU cpu) {
        this.memory = memory;
        this.cpu = cpu;
    }

    public void startup() {
        System.out.println("begin to start the computer...\n");
        memory.startup();
        cpu.startup();
        System.out.println("computer start finished...\n");
    }

    public void shutdown() {
        System.out.println("begin to close the computer...\n");
        memory.shutdown();
        cpu.shutdown();
        System.out.println("computer close finished...\n");
    }
}
