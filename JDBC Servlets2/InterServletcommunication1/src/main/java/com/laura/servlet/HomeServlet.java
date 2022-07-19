package com.laura.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// muestra la respuesta
		PrintWriter out = response.getWriter();
		// dice que tipo de contenido es
		response.setContentType("text/html");
		// muestra el metodo en login
		out.print(request.getAttribute("message"));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// muestra la respuesta
		PrintWriter out = response.getWriter();
		// dice que tipo de contenido es
		response.setContentType("text/html");
		// muestra el metodo en login
		out.print(request.getAttribute("message"));

	}

}
