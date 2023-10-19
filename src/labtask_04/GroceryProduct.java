package labtask_04;

class GroceryProduct extends Product {
    private String expirationDate;
    private String nutritionalValues;

    public GroceryProduct(String id, String name, double price, int stockQuantity, String expirationDate, String nutritionalValues) {
        super(id, name, price, stockQuantity);
        this.expirationDate = expirationDate;
        this.nutritionalValues = nutritionalValues;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getNutritionalValues() {
        return nutritionalValues;
    }

    public void setNutritionalValues(String nutritionalValues) {
        this.nutritionalValues = nutritionalValues;
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery Product Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: Rs:" + getPrice());
        System.out.println("Stock Quantity: " + getStockQuantity());
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Nutritional Values: " + nutritionalValues);
    }
}
