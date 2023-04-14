

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String str) {
        super(str);
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Store {
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int id) throws ProductNotFoundException {
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                found = true;
                products.remove(product);
                break;
            }
        }
        if (!found) {
            throw new ProductNotFoundException("Product not found in store.");
        }
    }

    public void displayProducts() {
        System.out.println("Product list:");
        for (Product product : products) {
            System.out.println(product.getId() + " - " + product.getName() + " - $" + product.getPrice());
        }
    }
}

public class Product {
    public static void main(String[] args) {
        Store store = new Store();
        Product product1 = new Product(1, "T-Shirt", 19.99);
        Product product2 = new Product(2, "Sneakers", 59.99);
        Product product3 = new Product(3, "Jeans", 29.99);
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        try {
            store.removeProduct(2);
            store.removeProduct(4); 
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
        store.displayProducts();
    }
}
