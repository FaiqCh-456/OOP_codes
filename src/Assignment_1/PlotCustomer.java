package Assignment_1;





public class PlotCustomer extends Customer {
    public static final int MAX_PLOTS_PER_CUSTOMER = 10;

    private final int[] allottedPlots;

    public PlotCustomer(int customerId) {
        super(customerId);
        this.allottedPlots = new int[MAX_PLOTS_PER_CUSTOMER];

    }

    public int[] getAllottedPlots() {
        return allottedPlots;
    }

    public void setAllottedPlot(int index, int plotNumber) {
        allottedPlots[index] = plotNumber;
    }
}
