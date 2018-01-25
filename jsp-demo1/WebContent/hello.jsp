<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<%!
private String format(Date date)  {
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	if(date != null) {
		//throw new RuntimeException("xxxx");
	}
	return df.format(date);
}
%>
<body>
<!-- xxx -->
<%-- <%@include file="head.jsp" %>--%>
<jsp:include page="head.jsp"></jsp:include>
Hello  JSP! <%=format(new Date()) %>

<%
	pageContext.setAttribute("name", "zhangsan");
	request.setAttribute("name", "lisi");
	session.setAttribute("name", "wangwu");
	application.setAttribute("name", "zhaoliu");
%>

<h1> <%= pageContext.getAttribute("name") %> </h1>
<h1> <%= request.getAttribute("name") %> </h1>
<h1> <%= session.getAttribute("name") %> </h1>
<h1> <%= application.getAttribute("name") %> </h1>

</body>
</html>