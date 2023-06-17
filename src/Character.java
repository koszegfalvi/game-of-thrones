public class Character {
    private String name;
    private final String placeOfBirth;
    private Gender gender;

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }


    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = gender; // vagy this.gender = Gender.EUNUCH
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }


    public Character(String name, String placeOfBirth) {
        this.name = name;
        this.placeOfBirth = placeOfBirth;
    }
}
