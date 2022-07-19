<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<%//Poner las propiedades que se obtienen de la pagina dinamicamente
//dentro de un bean usando jsp properties
//creamos la instancia de la clase
  //usando el asterisco hacemos referencia a todas las propiedaades, solo funciona con set
%>
<jsp:useBean id="product" class="com.laura.jsp.Product">
<jsp:setProperty property="*" name="product"/>
</jsp:useBean>

Product Details

</br> Id:<jsp:getProperty property="id" name="product"/>
</br> Name:<jsp:getProperty property="name" name="product"/>
</br> Description:<jsp:getProperty property="description" name="product"/>
</br> Price:<jsp:getProperty property="price" name="product"/>

</body>
</html>