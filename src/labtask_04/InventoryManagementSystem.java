package labtask_04;


public class InventoryManagementSystem {
    private Product[] productCatalog;
    private int size;

    public InventoryManagementSystem(int capacity) {
        this.productCatalog = new Product[capacity];
        this.size = 0;
    }

    public void addProduct(Product product) {
        if (size < productCatalog.length) {
            productCatalog[size++] = product;
        } else {

            throw new RuntimeException("Product catalog is full. Cannot add more products.");
        }
    }

    public void updateProductPrice(String productId, double newPrice) {
        Product product = getProductById(productId);
        if (product != null) {
            product.setPrice(newPrice);
        } else {
            throwProductNotFoundException(productId);
        }
    }

    public void updateStockQuantity(String productId, int quantity) {
        Product product = getProductById(productId);
        if (product != null) {
            product.updateStockQuantity(quantity);
        } else {
            throwProductNotFoundException(productId);
        }
    }

    public void removeProduct(String productId) {
        int index = getProductIndexById(productId);
        if (index != -1) {
            
            System.arraycopy(productCatalog, index + 1, productCatalog, index, size - index - 1);
            productCatalog[--size] = null; // Set the last element to null
        } else {
            throwProductNotFoundException(productId);
        }
    }

    public Product getProduct(String productId) {
        return getProductById(productId);
    }

    public void displayProductDetails(String productId) {
        Product product = getProductById(productId);
        if (product != null) {
            product.displayDetails();
        } else {
            throwProductNotFoundException(productId);
        }
    }

    private Product getProductById(String productId) {
        for (int i = 0; i < size; i++) {
            if (productCatalog[i].getId().equals(productId)) {
                return productCatalog[i];
            }
        }
        return null;
    }

    private int getProductIndexById(String productId) {
        for (int i = 0; i < size; i++) {
            if (productCatalog[i].getId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }

    private void throwProductNotFoundException(String productId) {
        throw new ProductNotFoundException("Product with ID " + productId + " not found.");
    }
}