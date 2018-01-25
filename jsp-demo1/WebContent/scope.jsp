<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>


<h1> <%= pageContext.getAttribute("name") %> </h1>
<h1> <%= request.getAttribute("name") %> </h1>
<h1> <%= session.getAttribute("name") %> </h1>
<h1> <%= application.getAttribute("name") %> </h1>

</body>
</html>