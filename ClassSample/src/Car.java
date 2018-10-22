public class Car {
    /*
    Creating instance variables or calling fields
    fields are belong to the class
    Usually, instance variable or field will use access modifier PRIVATE
     */

    //using public access modifier
/*    public int doors;
    public int wheels;
    public String model;
    public String engine;
    public String color;*/

    //using private access modifier
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    //void method to get data from public access modifier
/*    public void dataOutput(){
        System.out.println("The car model is: " + model);
    }*/

    //creating method to access the private  instance variable
    //mutator method or set method: changing the data stored in
    //private instance variables
    public void setModel(String model){
        this.model = model;
    }

    //creating method to get model
    //accessor method or get method: looking at the data contained
    //in an instance variable
    public String getModel(){
        return this.model;
    }

}
