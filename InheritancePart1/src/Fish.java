public class Fish extends Animal {

    //defining instance variables (fields) of Fish Class
    private int gills;
    private int eyes;
    private int fins;

    //creating constructor
    public Fish(String name, int size, int weight,
                int gills, int eyes, int fins){
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    //creating private method

    private void rest(){

    }

    private void moveMuscle(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscle();
        moveBackFin();
        super.move(speed);
    }
}
