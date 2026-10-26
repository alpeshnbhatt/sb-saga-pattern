package alp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCheck {
	 public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/userdb?useSSL=false&allowPublicKeyRetrieval=true";
			String user = "root";
			String password = "admin";
	        
	        try (Connection conn = DriverManager.getConnection(url, user, password)) {
	            // Check if connection is open and responsive (3-second timeout)
	            if (conn != null && conn.isValid(3)) {
	                System.out.println("Connection is healthy and ready to use!");
	            } else {
	                System.out.println("Connection is dead or unreachable.");
	            }
	        } catch (Exception e) {
	            System.err.println("Database connection failed: " + e.getMessage());
	        }
	    }
}
