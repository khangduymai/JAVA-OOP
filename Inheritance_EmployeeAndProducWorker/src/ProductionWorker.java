

public class ProductionWorker extends Employee {

    private int shiftHour;
    private int salary;





    public ProductionWorker() {

    }

    public ProductionWorker(int shiftHour, int salary) {
        this.shiftHour = shiftHour;
        this.salary = salary;
    }

    public int getShiftHour() {
        return shiftHour;
    }

    public void setShiftHour(int shiftHour) {
        this.shiftHour = shiftHour;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
