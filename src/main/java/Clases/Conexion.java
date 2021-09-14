package Clases;

import java.sql.*;

public class Conexion {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "admon";

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
	}

	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void close(PreparedStatement stmt) {
		try {
			stmt.close();
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		}
	}

}
