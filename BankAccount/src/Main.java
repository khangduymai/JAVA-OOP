public class Main {

    public static void main(String[] args){

        //creating empty constructor
        BankAccount emptyAcctConstructor = new BankAccount();

        //calling empty constructor with default value
        System.out.println("* Customer name: " + emptyAcctConstructor.getCustomerName());

        //calling constructor with parameters
        BankAccount khangAcct = new BankAccount(4591, 1000, "Khang Mai",
                "khang@hotmail.com", "4084776499");
        System.out.println("This is a constructor with parameters");
        //calling the data from the constructor
        System.out.println("- Customer name: " + khangAcct.getCustomerName());
        System.out.println("- Current balance is " + khangAcct.getBalance() + " \nfrom acct number " +
                            khangAcct.getAcctNumber());

    }

}
