public class MiniCharacterSimulator {
    public static void main(String[] args) {
        Character k = new King();
        k.display();
        k.fight();
        k.setWeapon(new AxeBehavior());
        k.fight();
        Character q = new Queen();
        q.display();
        q.fight();
    }
}
