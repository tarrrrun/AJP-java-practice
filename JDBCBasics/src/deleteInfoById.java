import java.sql.*;
public class deleteInfoById {

	public deleteInfoById() {
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

            String sqlDelete = "DELETE FROM customer_info WHERE cid = ?";

            ppStatement = conn.prepareStatement(sqlDelete);

            ppStatement.setInt(1, 101);

            int rowsDeleted = ppStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("customer record deleted successfully");
            } else {
                System.out.println("customer with this id could not be found in database");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("jdbc err");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error");
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
