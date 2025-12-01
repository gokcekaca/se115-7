import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many products? ");
        int size = input.nextInt();
        input.nextLine();

        Product[] products = new Product[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter product name: ");
            String name = input.nextLine();

            System.out.print("Enter stock: ");
            int stock = input.nextInt();
            input.nextLine();

            products[i] = new Product(name, stock);
        }

        while (true) {
            System.out.print("\nEnter product name to buy or Q to quit: ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("Q")) {
                break;
            }

            Product selected = null;

            for (Product p : products) {
                if (p.getName().equalsIgnoreCase(choice)) {
                    selected = p;
                    break;
                }
            }

            if (selected == null) {
                System.out.println("No such product!");
            } else {
                selected.buyOne();
            }
        }

        System.out.println("\nAttempting to buy all products once more:");
        for (Product p : products) {
            p.buyOne();
        }

        System.out.println("\nFinal Product List:");
        for (Product p : products) {
            p.printInfo();
        }

    }
}
