package Week12;

public class PartTimeStaff extends Staff{

    private int numOfHour;


    public PartTimeStaff(String name, String IC, int numOfHour) {
        super(name, IC);
        this.numOfHour = numOfHour;
    }

    public int getSalary(){
        return numOfHour * 40;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of working hours: " + numOfHour +
                "\nSalary: RM " + getSalary();
    }
}
