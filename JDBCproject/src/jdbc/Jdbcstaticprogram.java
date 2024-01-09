package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class Jdbcstaticprogram {

	public static void main(String[] args) {
		try
		{
		String Url= "jdbc:mysql://localhost:3306/db_Employee";
		String Username= "root";
		String Password= "Nidhi@2909";
		String query= "create table employee(Emp_id int, Nmae varchar(10), salary int)";
		
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//establish connection
		Connection con= DriverManager.getConnection(Url, Username, Password);
		System.out.println("Connection is established");
		//create statement
		Statement stmt = con.createStatement();
		System.out.println("Statement got created");
		//execute query
		stmt.execute(query);
		System.out.println("Query got executed");
	}
		catch (Exception e)
		{
			e.printStackTrace();
		}

}
}
