<html>
<body>
	<%
		String m1 = request.getParameter("m1");
		String m2 = request.getParameter("m2");
		String name = request.getParameter("name");
		int n1 = Integer.parseInt(m1);
		int n2 = Integer.parseInt(m2);
		double avg = (n1 + n2) / 2;
		String result="";
		if(avg >= 90 && avg < 100) {
			result = "Excellent";
		} else {
			result = "Good";
		}
		request.setAttribute("result", result);
		//request.setAttribute("name", name);
		request.getRequestDispatcher("cDisplayResults.jsp").forward(request, response);
	%>
</body>
</html>