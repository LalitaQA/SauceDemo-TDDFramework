package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DDT_05_ReadDataFromDB {

	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/M49", "root", "root");
		Statement stat = con.createStatement();
		ResultSet res = stat.executeQuery("SELECT prodname FROM SauceDemo");
		while (res.next()) {
			System.out.println(res.getString(1));
		}
	}

}
