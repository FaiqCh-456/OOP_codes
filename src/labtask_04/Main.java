package labtask_04;


public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem(10);

        Product electronicProduct = new ElectronicProduct("E1", "Laptop", 999.99, 10, "100W", "1 year");
        Product furnitureProduct = new FurnitureProduct("F1", "Chair", 49.99, 20, "Wood", "30x30x40 cm");
        Product groceryProduct = new GroceryProduct("G1", "Bread", 2.49, 50, "2023-10-31", "Low fat");

        inventorySystem.addProduct(electronicProduct);
        inventorySystem.addProduct(furnitureProduct);
        inventorySystem.addProduct(groceryProduct);

        inventorySystem.displayProductDetails("F1");
        inventorySystem.displayProductDetails("E1");
        inventorySystem.displayProductDetails("G1");

        inventorySystem.updateProductPrice("E1", 1099.99);
        inventorySystem.updateStockQuantity("G1", 20);
        inventorySystem.displayProductDetails("E1");

        System.out.println("Removing furniture product F1");
        inventorySystem.removeProduct("F1");

        // Attempting to display details for the removed product
        try {
            inventorySystem.displayProductDetails("F1");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
