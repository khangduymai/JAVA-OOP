public class Penguin extends Bird {

    public Penguin(String name){
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I AM NOT GOOD AT FLYING");
    }
}