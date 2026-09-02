public class Main {
    public static void main(String[] args) {
        PayrollSystem system = new PayrollSystem();

        Employee e1 = new FullTimeEmployee(101, "Arun Kumar", 45000, 2000);
        Employee e2 = new PartTimeEmployee(102, "Divya S", 300, 80);

        system.addEmployee(e1);
        system.addEmployee(e2);

        System.out.println("---- In-Memory Payroll ----");
        system.displayAll();

        System.out.println("\n---- Saving to MySQL ----");
        system.saveEmployeeToDB(e1);
        system.saveEmployeeToDB(e2);

        System.out.println("\n---- Reading from MySQL ----");
        system.displayFromDB();
    }
}
