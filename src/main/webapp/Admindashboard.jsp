<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AdminloginSer" method="get">
  
        <h3>Enter Login details</h3>
  
        <table>
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="uname" /></td>
            </tr>
            <tr>
                <td>User Password:</td>
                <td><input type="password" name="Pass" /></td>
            </tr>
  
        </table>
          
        <input type="submit" value="Login" />
  
    </form>
</body>
</html>