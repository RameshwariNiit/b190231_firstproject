
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Online Shoping Web Site </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>


<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="">ChetanSports</a>
    </div>
    <ul class="nav navbar-nav">
   <li class="active"><a href="${contextPath}">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Products <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
         
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <security:authorize access="isAnonymous()">
      <li><a href="${contextPath}/reg"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="${contextPath}/signin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </security:authorize>
    </ul>
  </div>
</nav>
  
