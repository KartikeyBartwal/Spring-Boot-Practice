<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>List Todos Page</title>

<!-- Add Bootstrap CSS -->
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet" />

<!-- Add jQuery (if needed by Bootstrap or your scripts) -->
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

<!-- Add Bootstrap JS -->
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Enter Todo Details</h1>
		<form:form method="post" modelAttribute="todo">
		Description: <form:input type="text" path="description" />
			<form:errors path="description" cssClass="text-warning"/>
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			<input type="submit" class="btn btn-success">
		</form:form>
	</div>
</body>
</html>
