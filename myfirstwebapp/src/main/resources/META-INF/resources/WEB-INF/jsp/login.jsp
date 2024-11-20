<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<link rel="stylesheet" href="styles.css">
<style>
/* General Reset */
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

/* Body Styling */
body {
	font-family: 'Arial', sans-serif;
	background: linear-gradient(135deg, #4facfe, #00f2fe);
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

/* Login Container */
.login-container {
	width: 100%;
	max-width: 400px;
	padding: 20px;
}

/* Login Card Styling */
.login-card {
	background: #fff;
	border-radius: 10px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	padding: 30px 20px;
	text-align: center;
}

/* Title */
.login-title {
	font-size: 24px;
	font-weight: bold;
	color: #333;
	margin-bottom: 20px;
}

/* Input Groups */
.input-group {
	margin-bottom: 15px;
	text-align: left;
}

.input-group label {
	display: block;
	font-size: 14px;
	color: #555;
	margin-bottom: 5px;
}

.input-group input {
	width: 100%;
	padding: 10px;
	border: 1px solid #ddd;
	border-radius: 5px;
	font-size: 14px;
	outline: none;
	transition: 0.3s;
}

.input-group input:focus {
	border-color: #4facfe;
	box-shadow: 0 0 5px rgba(79, 172, 254, 0.5);
}

/* Button */
.btn {
	background: #4facfe;
	color: #fff;
	padding: 10px 15px;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	cursor: pointer;
	width: 100%;
	transition: 0.3s;
}

.btn:hover {
	background: #00f2fe;
}

/* Forgot Password */
.forgot-password {
	display: block;
	margin-top: 10px;
	font-size: 12px;
	color: #4facfe;
	text-decoration: none;
}

.forgot-password:hover {
	text-decoration: underline;
}

/* Signup Text */
.signup-text {
	margin-top: 20px;
	font-size: 14px;
	color: #555;
}

.signup-text a {
	color: #4facfe;
	text-decoration: none;
}

.signup-text a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="login-container">
		<div class="login-card">
			<h1 class="login-title">Welcome Back ${name}!</h1>
			<form>
				<div class="input-group">
					<label for="email">Email</label> <input type="email" id="email"
						placeholder="Enter your email" required>
				</div>
				<div class="input-group">
					<label for="password">Password</label> <input type="password"
						id="password" placeholder="Enter your password" required>
				</div>
				<div class="actions">
					<button type="submit" class="btn">Login</button>
					<a href="#" class="forgot-password">Forgot Password?</a>
				</div>
			</form>
			<p class="signup-text">
				Don't have an account? <a href="#">Sign up</a>
			</p>
		</div>
	</div>
</body>
</html>
