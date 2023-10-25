<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>Mobile No</th>
<th>UserName</th>
<th>Password</th>
<th>Action</th>
</tr>
<c:forEach items="${l}" var="s">

<tr>
<td><input type ="radio" name= "id" value = "${s.id}"></td>
<td>${s.name}</td>
<td>${s.mobno}</td>
<td>${s.username}</td>
<td>${e.password}</td>
<td><a href="delete?id=${s.id}">DELETE</a>||<a href="edit?id=${s.id}">EDIT</a></td>
</tr>


</c:forEach>


</table>
</body>
</html>