<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<body>
<title>Home Page</title>
</head>
<body>
  
    <form action="LoginPage" method="get">
  
        <h2>
            Hello  
            <%=request.getParameter("name")%>! 
        </h2>
        <h3>Welcome to LINKCODE Technologies.....</h3>
  <h2>"LETS BUILD A BETTER GENERATION"</h2>
        <br> 
    </form>
     <form action="UserInterface" method="get">
    <h3><a href="curd.jsp">Update your data here</a></h3>
    </form>
    <form action="UserInterface" method="get">
    <h3><a href="curd.jsp">View your record here,.</a></h3>
    </form>
</body>
</html>