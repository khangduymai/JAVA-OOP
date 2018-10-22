public class Main {

    public static void main(String[] args){
        Car toyota = new Car();

        //This apply for public instance variable in Car class
/*        toyota.model = "Camry";
        String carName = toyota.model;
        System.out.println(toyota.model);
        System.out.println(carName);*/

        // print the method dataOutput from Car class
        // after declare the value of toyota.model
        //toyota.dataOutput();

        toyota.setModel("Camry");
        System.out.println("The car model is " + toyota.getModel());
        //System.out.println(toyota.setModel("Honda"));
    }
}
