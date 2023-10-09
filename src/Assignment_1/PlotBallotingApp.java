package Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class PlotBallotingApp {
    private final PlotManager plotManager;

    public PlotBallotingApp() {
        this.plotManager = new PlotManager();
    }

    public void run(Scanner scanner) {
        while (true) {
            System.out.print("Enter the number of plots to allot to the customer or enter 0 to exit: ");
            int plotsToAllot = scanner.nextInt();

            if (plotsToAllot == 0) {
                break;
            }

            if (plotsToAllot < 1 || plotsToAllot > PlotCustomer.MAX_PLOTS_PER_CUSTOMER) {
                System.out.println("Invalid input. Number of plots should be between 1 and 10.");
                System.out.println();
                continue;
            }

            PlotCustomer customer = new PlotCustomer(++plotManager.customerCount);
            plotManager.allotPlotsRandomly(customer, plotsToAllot);

            System.out.println("Plots allotted to Customer " + customer.getCustomerId() + ": "
                    + Arrays.toString(customer.getAllottedPlots()));
            System.out.println();
        }
    }
}

