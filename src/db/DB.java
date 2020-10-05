package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DB {
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3008/coursejdbc?autoReconnect=true&useSSL=false";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	}catch(SQLException e){
		throw new DbException(e.getMessage());
	}catch(ClassNotFoundException e) {
		throw new DbException(e.getMessage());
		}
	return conn;
	}
	
	public static void closeConnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	
	
	public static void closeStatement(Statement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	
	public static void closeResultSet(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
			throw new DbException(e.getMessage());
			}
		}
	}
	
}
