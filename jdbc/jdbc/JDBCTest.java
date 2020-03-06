package jdbc;
import java.sql.*;

public class JDBCTest {
	
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement st= null;
		ResultSet rs=null;
		String sql;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_store","student","student");
			System.out.println("database con sucessful");
			try {
				PreparedStatement pre=con.prepareStatement("select * from customers");
				rs=pre.executeQuery();
				
				while(rs.next()) {
//					System.out.println(rs.getString(1));
//					System.out.println(rs.getString(2));
					
				}
			} catch (SQLException e) {
				System.out.println(e);
			}	
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
