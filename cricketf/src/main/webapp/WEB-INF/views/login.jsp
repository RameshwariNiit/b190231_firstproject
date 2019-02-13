<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Sports</title>
</head>
<body>


	<jsp:include page="header.jsp" />

	<form action="login" method="post">





		<div class="container">

			<div class="row">



				<div class=col-sm-3></div>

				<div class="col-sm-6">

					<h2 style="text-align: center">Login form</h2>

					</br> <label><b>Email </b></label> <input type="text"
						placeholder="Enter Email ID " class="form-control" name="email"
						required> <br /> 
						<label><b>Password</b></label>
						 <input type="password" placeholder="Enter Password" class="form-control" 
						name="password" required> <br /> 
						<input type="submit" value="Log In" class="btn btn-primary">

					<div class="btn-group btn-group-lg">

						<a href="${contextPath}/reg"><button type="button"
								class="btn btn-info">Sign Up</button></a>



					</div>



				</div>

			</div>

		</div>

	</form>

</body>
</html>