public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double deductions;

    public FullTimeEmployee(int id, String name, double monthlySalary, double deductions) {
        super(id, name, "Full-Time");
        this.monthlySalary = monthlySalary;
        this.deductions = deductions;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary - deductions;
    }
}
