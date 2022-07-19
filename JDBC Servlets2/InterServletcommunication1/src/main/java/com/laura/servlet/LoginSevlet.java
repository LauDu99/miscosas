package com.laura.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Servlet implementation class LoginSevlet
 */
@WebServlet("/loginServlet")
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","12345");
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from user where email='"+userName+"' and password='"+password+"'");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("homeServlet");
			if(resultSet.next()) {
				request.setAttribute("message","Welcome to InterServlet " + userName);
				requestDispatcher.forward(request, response);
			}else {
				requestDispatcher = request.getRequestDispatcher("login.html");
				requestDispatcher.include(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
