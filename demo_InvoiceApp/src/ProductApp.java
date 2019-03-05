import java.util.Scanner;

public class ProductApp {

    public static void main(String arg[]){

        System.out.println("Welcome to the Product Selector");
        System.out.println();

        //display 1 or more products
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){

            //get the input from the user
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();
            sc.nextLine();

            //get the Product object

            //ProductDB db = new ProductDB();

            Product product = ProductDB.getProduct(productCode);

            //display output
            System.out.println();
            System.out.println("SELECTED PRODUCT");
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println();

            System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }


}
