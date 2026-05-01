<html>
<body>

<%
    String name = request.getParameter("name");
    out.println("Hello " + name);
%>


<%@page import="java.util.Date" %>
<%= "Expression tag" %>
<%= "Current Time: " + new Date().toString() %>

<%! int cube (int n) {
	return n*n*n;
}
%>

<%= "Cube of 3: " + cube(3) %>

</body>
</html>