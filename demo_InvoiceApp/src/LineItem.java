public class LineItem {

    private Product product;
    private int quantity;
    private double total;

    public LineItem(){
        this.product = new Product();
        this.quantity = 0;
        this.total = 0;
    }

    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }


    public double getTotal(){
        this.calculator();
        return total;
    }

    private void calculator(){

        total = quantity * product.getPrice();
    }
}
