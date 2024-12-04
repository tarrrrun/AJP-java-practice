import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAssessments {

    public JdbcAssessments() {
        // Constructor (currently not used)
    }

    public static void main(String[] args) {
        // Connection details
        String url = "jdbc:mysql://localhost:3306/myPortal";
        String user = "root";
        String password = "nimbus2000";

        Connection conn = null;
        Statement stmt = null;

        try {
            // Load MySQL JDBC Driver (optional with newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully");

            // Create statement object
            stmt = conn.createStatement();

            // SQL query to create table
            String sqlQuery = "CREATE TABLE customer_info (" +
                              "cid INT PRIMARY KEY, " +
                              "customer_name VARCHAR(30), " +
                              "address VARCHAR(30))";

            // Execute SQL query
            boolean result = stmt.execute(sqlQuery);
            System.out.println("Table created: " + !result);

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error:");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
