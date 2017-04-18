public class TestDrive {
    public static void main(String[] args) {
        CPU cpu = new CPU("CORE-i7");
        Memory memory = new Memory("KINGSTON-8G");
        ComputerFacade computer = new ComputerFacade (memory, cpu);
        computer.startup();
        computer.shutdown();
    }
}
