public class GameOfThrones {
    public class Main {
        public static void main(String[] args) {
            Noble noble1 = new Noble("Stark", "London", 50000, Gender.MALE, House.STARK);
            Noble noble2 = new Noble("Baratheon", "Coventry", 80000, Gender.MALE, House.BARATHEON);
            System.out.println(noble1.toString());

        }
    }
}


