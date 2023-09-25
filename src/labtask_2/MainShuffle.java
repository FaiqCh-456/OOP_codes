package labtask_2;

public class MainShuffle {
    public static void main(String[] args) {
        Deck d1 = new Deck();
        
        System.out.println();
        System.out.println("CARDS IN ORDER");
         System.out.println();
        System.out.println(d1);

        System.out.println("CARDS AFTER SHUFFLING");
        System.out.println();
        d1.Shuffle();
        System.out.println(d1);
        
        System.out.println("CARDS AFTER DISTRIBUTING TO 4 PLAYERS");
        System.out.println();
        Game game = new Game(d1);
        System.out.println(game);

    }
}
