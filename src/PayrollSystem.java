import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees = new ArrayList<>();

    // ---------- In-memory operations ----------
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }

    public void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    // ---------- MySQL persistence ----------
    public void saveEmployeeToDB(Employee e) {
        String sql = "INSERT INTO employees (id, name, role, salary) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, e.getId());
            ps.setString(2, e.getName());
            ps.setString(3, e.getRole());
            ps.setDouble(4, e.calculateSalary());
            ps.executeUpdate();
            System.out.println("Saved to DB: " + e.getName());
        } catch (SQLException ex) {
            System.out.println("DB Error: " + ex.getMessage());
        }
    }

    public void displayFromDB() {
        String sql = "SELECT * FROM employees";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Role: %s | Salary: Rs.%.2f%n",
                        rs.getInt("id"), rs.getString("name"),
                        rs.getString("role"), rs.getDouble("salary"));
            }
        } catch (SQLException ex) {
            System.out.println("DB Error: " + ex.getMessage());
        }
    }
}
