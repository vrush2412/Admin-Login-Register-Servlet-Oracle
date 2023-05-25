<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="UserInterface" method="get">
  
        <h3>Enter Your details</h3>
  
        <table>
            <tr>
                <td>User Registration no:</td>
                <td><input type="text" name="regno" /></td>
            </tr>
            <tr>
                <td>User fname to be updated:</td>
                <td><input type="text" name="fname" /></td>
            </tr>
  
        </table>
          
        <input type="submit" value="Update" />
  
    </form>
   <form action="UserInterface" method="get">
  
        <h3>Enter Your details</h3>
  
        <table>
            <tr>
                <td>User Registration no:</td>
                <td><input type="text" name="regno" /></td>
            </tr>
            
        </table>
          
        <input type="submit" value="View Record" />
  
    </form>
   
    
</body>
</html>