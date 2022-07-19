<%@ page import ="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% // bloque de codigo de declaracion %>
    <%!Connection con;
    PreparedStatement ps;
    
    public void jspInit(){
    	try{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","12345");
    		ps = con.prepareStatement("insert into account value(?,?,?,?)");
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public void jspDestroy(){
    	try{
    		ps.close();
    		con.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }%>
    
   <% // bloque donde va la logica del codigo %>
  <%
  int accno = Integer.parseInt(request.getParameter("accno"));
  String lastName = request.getParameter("lastname");
  String firstName = request.getParameter("firstname");
  int bal = Integer.parseInt(request.getParameter("bal"));
  
  ps.executeUpdate();
  %>
  
  <% // con esto puedes mandar de una pagina a otra. include manda a la pagina que desees al final del proceso %>
  <%@ include file ="openaccount.html"%>