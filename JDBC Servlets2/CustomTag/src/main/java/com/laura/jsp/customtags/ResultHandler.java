package com.laura.jsp.customtags;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.Tag;
import jakarta.servlet.jsp.tagext.TagSupport;

//es el tag que reescribe los metodos de un tag
//tag support reescribe solo los que queramos en el constructor
public class ResultHandler extends TagSupport {

	Connection con;
	PreparedStatement ps;

	public ResultHandler() {

		try {
			Class.forName("com.mysql.jc.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "12345");
			ps = con.prepareStatement("select * from user where email=?");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int doStartTag() throws JspException {
		// crea el vinculo con el request
		// puedes acceder a todos los datos de un jsp con pagecontext
		ServletRequest request = pageContext.getRequest();
		String email = request.getParameter("email");

		try {
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			// accediendo a la salida del objeto dentro jsp
			JspWriter out = pageContext.getOut();
			if (rs.next()) {
				// obtienes los datos de la tabla de la columna dada
				out.print("User details are:<br/> First Name:");
				out.print(rs.getString(1));
				out.print("<br/>Last Name:");
				out.print(rs.getString(2));
			} else {
				out.print("Ivalid email entered");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ignore el cuerpo ya que no tenemos uno
		return Tag.SKIP_BODY;
	}

	@Override
	public void release() {
		try {
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
