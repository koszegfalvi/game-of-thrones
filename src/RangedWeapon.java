public class RangedWeapon extends Weapon {
    int ammunition;

    public RangedWeapon(String name, int damage, int range, int ammunition) {
        super(name, damage, range);
        this.ammunition = ammunition;
    }

    @Override
    public void attack() {
        super.attack();
        ammunition--;
    }
}
