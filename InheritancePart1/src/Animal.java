public class Animal {

    //defining instance variables (fields) of the Animal Class
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //creating constructor
    public Animal(String name, int brain, int body, int size, int weight){
        this.name =  name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //creating get method (accessor method)

    public String getName(){
        return this.name;
    }

    public int getBrain() {
        return this.brain;
    }

    public int getBody() {
        return this.body;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

    //creating general methods for Animal Class
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called from Animal Class (SUPER CLASS). \n" +
                "Animal is moving at: " + speed);
    }

}
