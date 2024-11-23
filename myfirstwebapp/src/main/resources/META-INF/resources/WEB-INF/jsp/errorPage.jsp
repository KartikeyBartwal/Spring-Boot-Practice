<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Error - Something Went Wrong</title>
<link rel="stylesheet" href="styles.css">
</head>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f9;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

/* Centered Error Container */
.error-container {
	background-color: #fff;
	border-radius: 8px;
	padding: 20px;
	width: 90%;
	max-width: 600px;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
	text-align: center;
}

/* Error Heading */
.error-message h1 {
	color: #d9534f;
	font-size: 48px;
	margin-bottom: 20px;
}

/* Error Details */
.error-details {
	font-size: 18px;
	color: #333;
	margin-bottom: 30px;
}

/* Link to Go Back */
.back-link {
	display: inline-block;
	font-size: 16px;
	text-decoration: none;
	color: #007bff;
	padding: 10px 20px;
	border: 2px solid #007bff;
	border-radius: 5px;
	transition: all 0.3s ease;
}

.back-link:hover {
	background-color: #007bff;
	color: #fff;
}
</style>
<body>
	<div class="error-container">
		<div class="error-message">
			<h1>Error</h1>
			<p class="error-details">${errorMessage}</p>
			<a href="/" class="back-link">Go Back to Home</a>
		</div>
	</div>
</body>
</html>
