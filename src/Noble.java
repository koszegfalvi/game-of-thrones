import java.util.HashSet;
import java.util.Set;

public class Noble {

    private final Set<House> houses = new HashSet<>();
    private int wealth;

    public Noble(int wealth) {
        this.wealth = wealth;
    }
   public void addHouse(House house){
        houses.add(House.STARK);
   }

    public void removeHouse(House house){
        houses.remove(House.STARK);
    }
    public String getHousesAsString(){
        return houses.toString();
    }

    @Override
    public String toString() {
        return "Noble{" +
                "houses=" + getHousesAsString() +
                ", wealth=" + wealth ;
    }


    }


