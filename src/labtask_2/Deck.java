package labtask_2;

import java.util.Random;

public class Deck {
    Card cards[]= new Card[52];

    String suits[]={"Clubs", "Hearts", "Spades", "Diamonds"};

    String ranks[]={"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

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

    public void Shuffle(){

        Random random = new Random();

        for (int i = 0;i<100;i++) {
            int r = random.nextInt(52);
            Card temp = cards[0];
            cards[0] = cards[r];
            cards[r] = temp;
        }
        // sirs code
        //        for(int i =0;i<100;i++){
//        int randomIndex=random.nextInt(52);
//        Card temp = cards[randomIndex];
//        cards[randomIndex]= cards[0];
//        cards[0] = temp;
//        }
    }

}
