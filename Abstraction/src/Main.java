public class Main {

    public static void main(String[] args){

        Dog dog = new Dog("Huski");
        dog.eat();
        dog.breathe();
        System.out.println();

        /*
        This is giving error now because Bird class has become an abstract class
        Bird bird = new Bird("Parrot");
        bird.breathe();
        bird.eat();
        */

        Parrot parrot = new Parrot("Pacific Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        System.out.println();

        Penguin penguin = new Penguin("Antarctica Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();

    }
}
