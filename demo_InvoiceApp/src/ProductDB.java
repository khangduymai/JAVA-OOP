public class ProductDB {

    public static Product getProduct(String productCode){

        //create product object
        Product p = new Product();

        p.setCode(productCode);

        if(productCode.equalsIgnoreCase("java")){
            p.setDescription("Murach's Beginning Java");
            p.setPrice(49.50);
        }
        else if(productCode.equalsIgnoreCase("jsps")){
            p.setDescription("Murach's Java Servlets and JSP");
            p.setPrice(60.50);
        }
        else if(productCode.equalsIgnoreCase("mcb2")){
            p.setDescription("Murach's Mainframe COBOL");
            p.setPrice(55.50);
        }
        else {
            p.setDescription("unknown");
        }

        return p;
    }
}
