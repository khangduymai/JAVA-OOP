public class Dog extends Animal  {

   // private Object values;

   public Dog(String name){
       super(name);
   }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeating");
    }

}
