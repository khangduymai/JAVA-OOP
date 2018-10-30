public class Dog extends Animal {
    //defining instance variables for Dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("dog.chew() called from the private method of Dog Class");
    }
    @Override
    public void eat(){
        System.out.println("dog.eat() called from the Override method eat()");
        chew(); // call the private method from Dog Class
        super.eat(); // call the method from Animal Class
    }

    //creating public walk and run method for Dog class
    public void walk(){
        System.out.println("dog.walk() called from Dog Class");
        super.move(5);
    }

    public void run(){
        System.out.println("dog.run() called from Dog Class");
        super.move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called. \nDog moves at: " + speed);
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called from the override method in Dog Class");
        moveLegs(speed);
        //super.move(5);
    }
}
