package labtask_04;

class FurnitureProduct extends Product {
    private String material;
    private String dimensions;

    public FurnitureProduct(String id, String name, double price, int stockQuantity, String material, String dimensions) {
        super(id, name, price, stockQuantity);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }



    @Override
    public void displayDetails() {
        System.out.println("Furniture Product Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: Rs:" + getPrice());
        System.out.println("Stock Quantity: " + getStockQuantity());
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
    }
}

