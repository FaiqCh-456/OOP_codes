package labtask_2;

public class Game {
    Person players[] = new Person[4];

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            str.append("Player " + (i + 1) + ":\n");
            str.append("Shuffled Cards: " + players[i].shuffledCards() + "\n\n");
        }
        return str.toString();
    }

    Game(Deck deck) {
        for (int i = 0; i < 4; i++) {
            players[i] = new Person();
        }
        int counter = 0;
        for (int j = 0; j < 13; j++) {
            for (int i = 0; i < 4; i++) {
                players[i].inhand[j] = deck.cards[counter++];
            }
        }
    }
}

