package com.laura.servlets.preinit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PreInitServlet
 */
//load sirve para preinicializar el servidor sin tener un request, los numeros son priorizar
//@WebServlet(urlPatterns="/preInitServlet", loadOnStartup =0)
public class PreInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void init() {
    	System.out.println("Inside the init method");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().write("from the pre init servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
