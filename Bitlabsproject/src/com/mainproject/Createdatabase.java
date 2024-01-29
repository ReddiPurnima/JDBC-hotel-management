package com.mainproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabase {
	public static void main(String[] args)throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Chinnu@25");
			Statement stmt=con.createStatement();
			String sql="create database hms";
			boolean b=stmt.execute(sql);
			System.out.println("successfully created database");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}




