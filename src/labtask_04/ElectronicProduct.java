package labtask_04;

class ElectronicProduct extends Product {
    private String powerConsumption;
    private String warranty;

    public ElectronicProduct(String id, String name, double price, int stockQuantity, String powerConsumption, String warranty) {
        super(id, name, price, stockQuantity);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronic Product Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: Rs:" + getPrice());
        System.out.println("Stock Quantity: " + getStockQuantity());
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Warranty: " + warranty);
    }
}
