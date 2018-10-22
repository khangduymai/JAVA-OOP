public class BankAccount {
    //creating instance variables (fields)
    private int acctNumber, balance;
    private String customerName, email, phoneNumber;


    //creating empty constructor
    public BankAccount() {
        //setting default data when calling empty constructor
        this(11111, 0, "default name", "default email",
                "default phone");
        System.out.println("This is an empty constructor");
    }

    //creating constructor with parameters
    public BankAccount(int acctNumber, int balance, String customerName,
                       String email, String phoneNumber) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //creating set method
    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //creating get method

    public int getAcctNumber() {
        return this.acctNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFund(int deposit) {
        System.out.println("Balance after deposit: " + (balance += deposit));
    }

    public void withdraw(int withdraw) {
        if (balance - withdraw < 0)
            System.out.println("Only " + balance + " available. Withdraw cannot process");
        else
            System.out.println("Balance after withdraw " + withdraw + " is " + (balance -= withdraw));
    }
}
