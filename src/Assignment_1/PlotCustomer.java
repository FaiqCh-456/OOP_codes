package Assignment_1;


import java.util.Arrays;


public class PlotCustomer extends Customer {
    public static final int MAX_PLOTS_PER_CUSTOMER = 10;

    private int[] allottedPlots;

    public PlotCustomer(int customerId) {
        super(customerId);
        this.allottedPlots = new int[MAX_PLOTS_PER_CUSTOMER];
        Arrays.fill(allottedPlots, -1);
    }

    public int[] getAllottedPlots() {
        return allottedPlots;
    }

    public void setAllottedPlot(int index, int plotNumber) {
        allottedPlots[index] = plotNumber;
    }
}
