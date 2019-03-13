import java.util.Scanner;

public class InvoiceApp {

    public static Invoice invoice = new Invoice();

    public static void main(String args[]) {
        System.out.println("Welcome to the invoice application. \n");
        getLineItems();
        displayInvoice();
    }

    public static void getLineItems() {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = ProductDB.getProduct(productCode);
            invoice.addItem(new LineItem(product, quantity));

            System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();

        }

    }

    public static void displayInvoice() {
        System.out.println("Code\tDescription\t\t\tPrice\tQty\tTotal");
        System.out.println("----\t-----------\t\t\t------\t---\t-------");
        for (LineItem lineItem : invoice.getLineItems()) {
            Product product = lineItem.getProduct();
            String s = product.getCode()
                    + "\t" + product.getDescription()
                    + "\t" + product.getPrice()
                    + "\t" + lineItem.getQuantity()
                    + "\t" + lineItem.getTotal();
            System.out.println(s);

        }
        System.out.println("\n\t\t\t\t\t\t\t\t\t Invoice total: \t" +
                invoice.getInvoiceTotal());
    }
}
