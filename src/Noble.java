import java.util.HashSet;
import java.util.Set;

public class Noble extends Character {

    private final Set<House> houses = new HashSet<>();
    private int wealth;

    public Noble(String name, String placeOfBirth, int wealth, Gender gender, House house) {
        super(name, placeOfBirth);
        this.wealth = wealth;
        getWorldPopulation(population);
    }



    public void addHouse(House house) {
        houses.add(House.STARK);
    }

    public void removeHouse(House house) {
        houses.remove(House.STARK);
    }

    public String getHousesAsString() {
        return houses.toString();
    }

    @Override
    public String toString() {
        return "Noble{" +
                "houses=" + getHousesAsString() +
                ", wealth=" + wealth;
    }


}


