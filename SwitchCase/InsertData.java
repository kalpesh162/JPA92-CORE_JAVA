package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	private final static String URL = "jdbc:mysql://localhost:3306/jap89";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id = 1;
		String name = "Rahul";
		double marks = 66.66;

		// Step1 To Load Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Create Connection

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		// Step 3 Create Query 1 2 3 1 2 3
		String sql = "insert into student (id,name,marks) values  (?,?,?)";

		// String sql = "insert into student (id,marks,name) values (?,?,?)";

		// ? place holder
		// Step 4 :Give Query to Prepare Statment
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		// Step 5 : fill place holder
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, marks);

		// step 6 : ExcuteUpdate

		int row = preparedStatement.executeUpdate();
		System.out.println(row);

	}

}
