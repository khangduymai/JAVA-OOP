public class Main {

    public static void main(String[] args){

        Animal animal = new Animal("brain", 1,1,5,5);

        Dog dog = new Dog("Yorke",8,20,2,4,1,20,"long silky");

        //System.out.println(dog.getBrain());

        //dog.eat();

        //System.out.println();

        dog.walk();

        System.out.println();

        dog.run();

        System.out.println();

        dog.move(20);

    }


}
