<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cout Demo</title>
</head>
<body>
<c:out value="${10+9}"/>
<c:set var="testCore" value="${80}" scope="session"/>
<c:out value="${testCore}"/>
<c:if test="${testCore>=80}">
<p>Your score is awesome <c:out value="${testCore}"/></p>
</c:if>

<c:choose>
<c:when test="${testCore>=80}">
	A Grade
</c:when>
<c:when test="${testCore<80}">
	B Grade
</c:when>

<c:otherwise>
	 C Grade
</c:otherwise>
</c:choose>

<c:forEach var="i" begin="1" end="3">
<c:out value="${i}"/>
</c:forEach>

<% //request.setatributte pone la lista en una peticion%>
<%
List<String> studentNames = new ArrayList<>();
studentNames.add("Laura");
studentNames.add("Milton");
request.setAttribute("studentNames", studentNames);

%>
<c:forEach var="studentName" items="${studentNames}">
<c:out value="${studentName}"/>
</c:forEach>

<c:remove var="testCore"/>
After removal the value is:<c:out value="${testCore}"/>


<c:set var="accountBalance" value="${123456}"/>
<fmt:parseNumber var="i" type="number" value="${accountBalance}"/>
<p>Amount is:<c:out value="${i}"/></p>


<c:set var="accountBalance" value="4356.908"/>
<p>Formatted Number:<fmt:formatNumber value="${accountBalance}" type="currency"/></p>
<p>Formatted Number:<fmt:formatNumber value="${accountBalance}" type="number" maxFractionDigits="2"/></p>
<p>Formatted Number:<fmt:formatNumber value="${accountBalance}" type="number" maxIntegerDigits="2"/></p>
<p>Formatted Number:<fmt:formatNumber value="${accountBalance}" type="percent"/></p>
<p>Formatted Number:<fmt:formatNumber value="${accountBalance}" type="number" pattern="####.##$"/></p>

<c:set var="myDate" value="12:-07-2022"/>
<fmt:parseDate var="parseDate" value="myDate" pattern="dd-MM-yyyy"></fmt:parseDate>
<c:out value="${parseDate}"></c:out>
</body>
</html>