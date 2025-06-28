import java.util.Scanner;

public class ProductMain {


    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) total += p.getPrice() * p.getQuantity();
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // a) Accept five product information from user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product #" + (i + 1));
            System.out.print("  Product ID (pid): ");
            int pid = scanner.nextInt();
            System.out.print("  Price: ");
            double price = scanner.nextDouble();
            System.out.print("  Quantity: ");
            int qty = scanner.nextInt();
            products[i] = new Product(pid, price, qty);
        }

        // b) Find pid of product with highest price
        double maxPrice = products[0].getPrice();
        int pidMax = products[0].getPid();
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                pidMax = products[i].getPid();
            }
        }
        System.out.println("\nPID of the product with the highest price: " + pidMax);

        // c) Calculate total amount spent (price * quantity for each)
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: ₹" + totalAmount);

        scanner.close();
    }
}
