package labtask_2;

public class Deck {
    Card cards[]= new Card[52];

    String suits[]={"Clubs", "Hearts", "Spades", "Diamonds"};

    String ranks[]={"Ace","1","2","3","4","5","6","7","8","9","Jack","Queen","King"};

    Deck(){
        int counter = 0;
        for(int i=0; i<4; i++)

            for(int j=0; j<13; j++)

                cards[counter++]=new Card(suits[i],ranks[j]);
    }

    public String toString(){

        StringBuilder str= new StringBuilder();

        for(int r=0; r<52; r++)

            str.append(cards[r]+ "\n");

        return str.toString();
}

}
