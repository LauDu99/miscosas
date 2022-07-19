package com.laura.servlets.sm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TargetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		Cookie[] cookies = request.getCookies();
		for(int i =0; i<cookies.length;i++) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		
		//obteniendo el nombre de usuario de la sesion actual y desplegandolo al usuario
		HttpSession session = request.getSession();
		//obtenemos el nombre del usuario
		String userName = (String)session.getAttribute("user");
		//tipo de contenido
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("User name is"+userName);
		
	}
}
