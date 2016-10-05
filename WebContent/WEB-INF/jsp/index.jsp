<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title></title>
<script type="text/javascript" charset="UTF-8"
	src="//code.jquery.com/jquery-1.12.3.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script type="text/javascript"
	src="<c:url value="/resources/js/index.js" />"></script>
</head>

<body>
	<div class="container" style="text-align: center">
		<br> <br> <br>
		<h2 style="color: green">Welcome to ORM-Hibernate</h2>
		<br> <br>
		<div class=" div-add">
			<p>Add new Employee here:</p>
			ID: <input class="id" type="text" /> Name: <input class='name'
				type="text" /> Salary: <input class='salary' type="text" />
			<br><br>
			<button class="add btn btn-success" type="button">Add</button>
		</div>
	</div>
</body>
</html>