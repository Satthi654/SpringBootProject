<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orangeyellow">
<form action="/employee" method="POST">
<table border='6'>
<tr>
<th>Employee Registration Page</th>
</tr>
<tr>
<td>Employee ID</td>
<td><input type='text' name="eid"/></td>
</tr>
<tr>
<td>Employee Name</td>
<td><input type='text' name="ename"/></td>
</tr>
<tr>
<td>Employee Salary</td>
<td><input type='text' name="esal"/></td>
</tr>
<tr>
<td><input type='submit' value="REGISTRATION"/> </td>
</tr>
</table>
</form>
</body>
</html>