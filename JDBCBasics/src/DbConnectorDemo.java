import java.sql.*;
public class DbConnectorDemo {

	public DbConnectorDemo() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		String constring = "jdbc:mysql://localhost:3306/myPortal";
		String user="root";
		String password = "nimbus2000";
		 try {
			conn = DriverManager.getConnection(constring,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println(conn);
		}else {
			System.out.println("Could not connect to Database");
		}
//		Statement s = null;
//		try {
//			 s = conn.createStatement();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String sqlQuery="create table User(uid int primary key, name varchar(30),address varchar(30))";
//		try {
//			boolean res = s.execute(sqlQuery);
//			System.out.println(res);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
	}

}
