import java.util.Scanner;

public class LineItemApp {

    public static void main(String arg[]) {

        System.out.println("Welcome to the Line Item Calculator");
        System.out.println();

        //display 1 or more products
        Scanner scLineItem = new Scanner(System.in);
        String choiceItem = "y";
        while (choiceItem.equalsIgnoreCase("y")) {

            //get the input from the user
            System.out.print("Enter product code: ");
            String productCode = scLineItem.nextLine();
            scLineItem.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = scLineItem.nextInt();
            scLineItem.nextLine();
            //get the Product object

            Product product = ProductDB.getProduct(productCode);

            //get the Line Item object
            LineItem lineItem = new LineItem();
            lineItem.setProduct(product);
            lineItem.setQuantity(quantity);

            //display output
            System.out.println();
            System.out.println("LINE ITEM");
            System.out.println("Code: " + product.getCode());
            System.out.println("Descriptions: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity:  " + lineItem.getQuantity());
            System.out.println("Total: " + lineItem.getTotal());
            System.out.println();

            System.out.println("Continue? (y/n): ");
            choiceItem = scLineItem.nextLine();
            System.out.println();
        }
    }
}
