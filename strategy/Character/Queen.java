public class Queen extends Character {
    public Queen () {
        weapon = new AxeBehavior();
    }
    public void display() {
        System.out.println("I'm a Queen!");
    }
}
