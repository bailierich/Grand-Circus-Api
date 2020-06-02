<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grand Circus</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />
</head>
<body>


<div class = container>
<h1>All About <c:out value="${SchoolName}" ></c:out></h1>
<h2>The CEO of Grand Circus is <c:out value="${ceo}" ></c:out></h2>

<h3>Grand Circus Rooms</h3>
<table class = table>
  <thead>
<tr>
<th>Room Name</th>
<th>Level</th>
</tr>
</thead>
<tbody>
<c:forEach var ="room" items="${rooms}">
<tr>
<td><c:out value="${room.name}"></c:out></td>
<td><c:out value="${room.level}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>



<h3>Language Info</h3>
<table class = table>
  <thead>
<tr>
<th>Language</th>
<th>Creator</th>
</tr>
</thead>
<tbody>
<c:forEach var ="language" items="${languages}">
<tr>
<td><c:out value="${language.name}"></c:out></td>
<td><c:out value="${language.creator}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>




</body>
</html>