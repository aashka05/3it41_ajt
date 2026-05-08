<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@page import="java.lang.Math" %>
	<%
	int n = Integer.parseInt(request.getParameter("number"));
	int flag = 0;
	if(n <= 1) {
	    flag = 1;
	}
	for(int i = 2; i <= Math.sqrt(n); i++) {

	    if(n % i == 0) {
	        flag = 1;
	        break;
	    }
	}

	if(flag == 0) {
		request.getRequestDispatcher("Profile.jsp").forward(request, response);
	} else {
		out.println("<h1>try again</h1>");
		request.getRequestDispatcher("index.html").include(request, response);
	}
	
	%>
</body>
</html>