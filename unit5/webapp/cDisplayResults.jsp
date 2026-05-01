<html>
<body>
<%
	String name = request.getParameter("name");
	String result = (String)request.getAttribute("result");
	out.println(name + " " + result);
%>
</body></html>