package character;

import character.type.Gender;

public class Character  implements Mortal {
    private String name;
    private final String birthPlace;
    private Gender gender;


    private static int WorldPopulation=0;

    public static int getWorldPopulation() {
        return WorldPopulation;
    }

    public Character(String name, String birthPlace, Gender gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
       WorldPopulation++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE &&
                gender == Gender.EUNUCH) {
            this.gender = gender;
        }
    }
public void decreasePopulation(){
        WorldPopulation--;
}
    public void die() {
        decreasePopulation();
    }


    public void castration() {
        if (this.gender == Gender.MALE) {
            this.gender = Gender.EUNUCH;
        }
    }




}