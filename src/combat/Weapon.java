
package combat;

import java.util.HashSet;
import java.util.Set;

public abstract class Weapon {
    private String name;
    private int damage;


    Set<Weapon> weapons = new HashSet<>();

    public void addWeapon(Weapon weapon) {
    }

    public void removeWeapon(String weaponName) {
    }

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    private int range;

    public void attack() {

    }


}
