import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){

/*        ProductionWorker employee = new ProductionWorker();
        employee.setEmpID(111);*/

        int sizeOfWorkers;

        sizeOfWorkers = getInteger("Please enter the size of the workers");

        ProductionWorker[] workerProfiles = new ProductionWorker[sizeOfWorkers];

        for(int i = 0; i < workerProfiles.length; i++){
            workerProfiles[i] = new ProductionWorker();
            String employeeName = getString("Please enter employee #" + (i+1));
            workerProfiles[i].setName(employeeName);
            int employeeID = getInteger("Please enter employee #" + (i+1) + " ID:");
            workerProfiles[i].setEmpID(employeeID);
            int shiftHour = getInteger("Please enter 1 for day shift or 2 for night shift");
            workerProfiles[i].setShiftHour(shiftHour);
            int employeeSalary = getInteger("Please enter employee salary");
            workerProfiles[i].setSalary(employeeSalary);
        }

        for(int i = 0; i < workerProfiles.length; i++){
            String name = workerProfiles[i].getName();
            int ID = workerProfiles[i].getEmpID();
            int shift = workerProfiles[i].getShiftHour();
            int salary = workerProfiles[i].getSalary();

            System.out.println(name + " has an ID of " + ID + " and his/her shift is " + shift + ". And his/her salary is" +
                    " " + salary);

            System.out.println();

        }




    } // end main


    public static int getInteger(String msg) {
        System.out.println(msg);
        while (!keyboard.hasNextInt()) {
            keyboard.nextLine();
            System.err.println("Invalid integer. Try again.");
        }
        int number = keyboard.nextInt();
        keyboard.nextLine(); //flushes the buffer
        return number;
    }

    public static String getString(String msg) {
        String answer = "";
        System.out.println(msg);
        try {
            answer = keyboard.nextLine();
        }
        catch (Exception e) {
            System.err.println("Error reading input from user. Ending program.");
            System.exit(-1);
        }

        while (answer.replace(" ", "").equals("")) {
            System.err.println("Error: Missing input.");
            try {
                System.out.println(msg);
                answer = keyboard.nextLine();
            }
            catch (Exception e) {
                System.err.println("Error reading input from user. Ending program.");
                System.exit(-1);
            }
        }
        return answer;
    }




}
