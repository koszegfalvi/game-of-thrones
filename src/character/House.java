package character;

public enum House {
    STARK("Közeleg a tél", "Winter is Coming", "wolf"),
    LANNISTER("Halld üvöltésem", "Hear Me Roar", "lion"),
    TARGARYEN("Tűz és vér", "Fire and Blood", "dragon"),
    BARATHEON("Miénk a harag", "Ours is the Fury", "stag"),
    GREYJOY("Mi nem vetünk", "We Do Not Sow", "kraken"),
    TYRELL("Erőssé növünk", "Growing Strong", "rose");


    House(String magyarJelMondat, String angolJelMondat, String sigil) {

        this.magyarJelMondat = magyarJelMondat;
        this.angolJelMondat = angolJelMondat;
        this.sigil = sigil;
    }

    public String getMagyarJelMondat() {
        return magyarJelMondat;
    }

    public String getAngolJelMondat() {
        return angolJelMondat;
    }

    private final String magyarJelMondat;
    private final String angolJelMondat;
    private String sigil;
}
