public class Main {

    public static void main(String[] args){

        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());

        VIPCustomer person2 = new VIPCustomer("Khang", 1000.0);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());

        VIPCustomer person3 = new VIPCustomer("Khai", 1000.0, "khai@mail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());


    }
}
