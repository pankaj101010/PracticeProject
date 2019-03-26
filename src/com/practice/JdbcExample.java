package com.practice;

import java.sql.*;
public class JdbcExample {

	public static void main(String[] args) throws SQLException {
		 Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=EmployeeDetails;");
       Statement stmt =con.createStatement();
       String s = "select * from Emplpoyee";
       stmt.execute(s);
	}

}
