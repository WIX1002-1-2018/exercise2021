package Week12;

public class PermanentStaff extends Staff {

    private String grade;

    public PermanentStaff(String name, String IC, String grade) {
        super(name, IC);
        this.grade = grade;
    }

    public int getSalary() {
        return switch (grade) {
            case "EM01" -> 7000;
            case "EM02" -> 5000;
            case "EM03" -> 3000;
            case "EM04" -> 1000;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return super.toString() + "\nGrade: " + grade + "\nSalary: RM " + getSalary();
    }
}
