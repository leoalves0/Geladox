package repositoryDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/geladeira?autoReconnect=true&useSSL=false","root", "1q2w3e4r");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
