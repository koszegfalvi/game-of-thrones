
package combat;


import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {
    private RangedWeaponType type;
    int ammunition;

    public RangedWeapon(String name, int damage, int range, RangedWeaponType type, int ammunition) {
        super(name, damage, range);
        this.type = type;
        this.ammunition = ammunition;
    }

    public RangedWeapon(String name, int damage, int range, int ammunition) {
        super(name, damage, range);
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "type=" + type +
                ", ammunition=" + ammunition +
                '}';
    }

    @Override
    public void attack() {
        super.attack();
        ammunition--;
    }
}
