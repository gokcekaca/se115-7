public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void buyOne() {
        if (stock > 0) {
            stock--;
            System.out.println(name + " purchased. Remaining stock: " + stock);
        } else {
            System.out.println("Out of stock!");
        }
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Product: " + name + " | Stock: " + stock);
    }
}
