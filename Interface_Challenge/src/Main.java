import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Player Tim = new Player("Tim", 10, 15);

        System.out.println(Tim.toString());
        saveObject(Tim);
        System.out.println();
        Tim.setHitPoints(8);
        System.out.println(Tim);
        Tim.setWeapon("Lazer Gun");
        saveObject(Tim);
        //loadObject(Tim);
        //System.out.println(Tim);
        System.out.println();

        ISaveable monster = new Monster("King Kong", 30, 50);
        System.out.println("Monster name is: " + ((Monster) monster).getName());
        saveObject(monster);
        System.out.println(monster);
    } // end main

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println();
        System.out.println("choose\n" +
                "1 to enter a string\n" +
                "0 to quit\n");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        } // end while

        return values;

    } //end readValues


    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
