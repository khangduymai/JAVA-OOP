public class VIPCustomer {

    //Creating field names (instance variables)
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    //Creating an empty constructor
    public VIPCustomer(){
        this("Default Name", 0.0, "Default Email");
    }

    //Creating a constructor that saves 2 values and the 3rd one is default
    public VIPCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@email.com");
    }

    //Creating a constructor that saves all parameters
    public VIPCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
