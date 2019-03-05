
import java.text.NumberFormat;

public class Product {

    //create a private field
    String code, description;
    double price;


    //create get method
    public double getPrice(){
        return this.price;
    }

    public String getCode(){
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    //create set method
    public void setPrice(double price){
        this.price = price;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setDescription(String description){
        this.description = description;
    }

}
