package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon {
private MeleeWeaponType type;
    private int ammunition;

    public MeleeWeapon(String name, int damage, int range, MeleeWeaponType type, int ammunition) {
        super(name, damage, range);
        this.type = type;
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                "type=" + type +
                ", ammunition=" + ammunition +
                '}';
    }

    public MeleeWeapon(String name, int damage, int range) {
        super(name, damage, range=1);

    }
}

