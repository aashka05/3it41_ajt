<html>
<body>
<%@page import="java.lang.Math" %>
<%
	String radius = request.getParameter("radius");
	double r = Double.parseDouble(radius);
	
	double area = Math.PI * r * r;
	request.setAttribute("area", area);
	request.getRequestDispatcher("dDisplayArea.jsp").forward(request, response);
	
%>
</body>
</html>