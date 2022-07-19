package com.laura.servlets.sm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SourceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// mostrando nombre y valor del cookie actual
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				System.out.println(cookies[i].getName());
				System.out.println(cookies[i].getValue());
			}
		}
		// agregando un token de seguridad al cookie para identificarlo
		response.addCookie(new Cookie("security token", "12345"));

		// obteniendo el usuario del formulario
		String userName = request.getParameter("userName");
		// obteniendo la sesion actual
		HttpSession session = request.getSession();
		// set atribute permite poner valores pares dentro de la sesion del objeto
		session.setAttribute("user", userName);
		// poner al usuario dentro de la sesion
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String url = "targetServlet?sessionID=123";
		out.print("<a href='" + url + "'>Click here to get to the username</a>");

	}

}
