package learnD;

import java.sql.*;

public class WordBank 
{
	Connection dbConnection;
	
	public WordBank(String dbUrl, String dbDriver) throws SQLException, ClassNotFoundException
	{
		Class.forName(dbDriver);
		dbConnection = DriverManager.getConnection(dbUrl);
	}
	
	
}
