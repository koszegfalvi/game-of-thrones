package character;

import character.type.Gender;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Noble extends Character {

    private Set<House> houses = new HashSet<>();

    Map<String, Integer> coins = new HashMap<>();
    int amount;
   int copper=amount;
    int golden= copper*100;
    int silver=copper*10;
    int coinType;

    switch (coinType) {
        case "gold" -> totalWealth += amount * 100;
        case "silver" -> totalWealth += amount * 10;
        case "copper" -> totalWealth += amount;
    }

    public Integer nobleWealth(House house, int golden, int silver, int copper) {
        return golden + silver + copper;
    }

    Integer totalWealth = 0;

    public Integer getWealth() {
        return totalWealth;

    }

    public Noble(String name, String placeOfBirth, int wealth, Gender gender, House house) {
        super(name, placeOfBirth, gender);

    }

    @Override
    public void die() {
        for (House house : houses) {
            System.out.println(house.getAngolJelMondat());
        }
        super.die();
    }


    public void addHouse(House house) {
        this.houses.add(house);
    }

    public void removeHouse(House house) {
        houses.remove(house);
    }

    public String getHousesAsString() {
        return houses.toString();
    }

    @Override
    public String toString() {
        return getName() +
                " of house" + houses.toString() +
                " has " + getWealth() + "gold dragons";
    }


}


