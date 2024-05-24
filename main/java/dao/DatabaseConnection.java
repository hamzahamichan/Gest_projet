package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection connection;
	
	static {
		String url="jdbc:mysql://localhost:3306/projet_manager";
		String username="root";
		String password="1234ham";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection =DriverManager.getConnection(url,username,password);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	}
		
	
}
	
	public static Connection getConnection(){
	
		return connection;
	}
	}

