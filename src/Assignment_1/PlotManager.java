package Assignment_1;


import java.util.Random;

public class PlotManager {
    private static final int TOTAL_PLOTS = 100;
    private boolean[] plotAvailability = new boolean[TOTAL_PLOTS];
    public int customerCount = 0;
    private Random random = new Random();

    public void allotPlotsRandomly(PlotCustomer customer, int plotsToAllot) {
        for (int i = 0; i < plotsToAllot; i++) {
            int plotNumber;
            do {
                plotNumber = random.nextInt(TOTAL_PLOTS) + 1;
            } while (plotAvailability[plotNumber - 1]);

            plotAvailability[plotNumber - 1] = true;
            customer.setAllottedPlot(i, plotNumber);
        }
    }
}
