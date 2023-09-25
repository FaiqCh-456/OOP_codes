package labtask_2;

public class Card {
    private String suits;
    private String ranks;

    public String getSuits() {
        return suits;
    }

    public String getRanks() {
        return ranks;
    }

    public Card(String suits, String ranks) {
        this.suits = suits;
        this.ranks = ranks;
    }


    public String toString() {
        return String.format("%s of %s",ranks,suits);
    }
}

