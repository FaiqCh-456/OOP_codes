
package Assignment_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("********_Welcome to Plot Balloting System_*******");
        System.out.println();
        System.out.println("********_Total Number of plots are 100_*******");
        System.out.println("****_The maximum number of plots that can be allocated to a customer are 10_****");
        System.out.println();

        PlotBallotingApp app = new PlotBallotingApp();
        app.run(scanner);

    }
}
