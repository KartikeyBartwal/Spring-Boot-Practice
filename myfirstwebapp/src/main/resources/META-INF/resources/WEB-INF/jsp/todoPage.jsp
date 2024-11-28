<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>List Todos Page</title>
    
    <!-- Add Bootstrap CSS -->
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" />
    
    <!-- Add jQuery (if needed by Bootstrap or your scripts) -->
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    
    <!-- Add Bootstrap JS -->
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container mt-4">
        <div class="alert alert-info">Welcome ${name}</div>

        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Is Done?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-success">Add Todo</a>
    </div>
</body>
</html>
