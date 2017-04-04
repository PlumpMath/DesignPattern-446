public abstract class Character {
    WeaponBehavior weapon;
    public Character () {}

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public abstract void display();

    public void fight() {
        weapon.useWeapon();
    }

    public void walk() {
        System.out.println("All characters can walk!");
    }
}
