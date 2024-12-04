import java.sql.*;
public class AddCustomerInfo {

	public AddCustomerInfo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/myPortal";
        String user = "root";
        String password = "nimbus2000";

        Connection conn = null;
        PreparedStatement ppStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully");

            String sqlInsert = "INSERT INTO customer_info (cid, customer_name, address) VALUES (?, ?, ?)";

            ppStatement = conn.prepareStatement(sqlInsert);
            ppStatement.setInt(1, 102);
            ppStatement.setString(2, "Aman"); 
            ppStatement.setString(3, "Noida"); 

            int rowsInserted = ppStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("record added successfully");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("error occurred");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("another error occurred");
            e.printStackTrace();
        } finally {
            try {
                if (ppStatement != null) ppStatement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


	}

}
