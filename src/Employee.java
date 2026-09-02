public abstract class Employee {
    protected int id;
    protected String name;
    protected String role;

    public Employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }

    // Every subclass must define how salary is calculated
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Role: %s | Salary: Rs.%.2f",
                id, name, role, calculateSalary());
    }
}
