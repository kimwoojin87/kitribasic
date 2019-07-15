package bookservice;

import java.sql.*;

public class DBConnection {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static DBConnection obj;

	public static DBConnection sharedinstance() {
		if (obj == null) {
			obj = new DBConnection();
		}
		return obj;
	}
	
	Connection con;
	

	private Connection getcon() {

		try {
			return con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kitri", "kitri");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
