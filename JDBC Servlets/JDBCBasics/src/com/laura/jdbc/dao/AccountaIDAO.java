package com.laura.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountaIDAO {
	public static void main(String[] args) {// tiene que ser tu contraseñaa
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "12345");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select*from account");) {// si no es localhost poner la ip si es
																				// otro puerto poner el puerto asignado,
																				// usuario y contra
			System.out.println(connection);
			// int result = statement.executeUpdate("insert into account
			// values(1,'Laura','Duran',1000)");
			// int result = statement.executeUpdate("update account set bal=5000 where
			// accno=1");
			// int result = statement.executeUpdate("delete from account where accno=1");
			// System.out.println(result);
			while (rs.next()) {
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
