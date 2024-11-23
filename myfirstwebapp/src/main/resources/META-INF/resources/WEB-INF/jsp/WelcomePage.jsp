<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Welcome Page</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Arial', sans-serif;
      background: linear-gradient(to right, #6a11cb, #2575fc);
      color: white;
      text-align: center;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      overflow: hidden;
    }

    .welcome-container {
      background: rgba(255, 255, 255, 0.1);
      backdrop-filter: blur(10px);
      border-radius: 15px;
      padding: 50px 30px;
      box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
      width: 90%;
      max-width: 500px;
    }

    .welcome-container h1 {
      font-size: 3em;
      margin: 0 0 10px;
      color: #ffd700;
      text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.3);
    }

    .welcome-container p {
      font-size: 1.2em;
      margin: 10px 0;
    }

    .welcome-container .dynamic-info {
      font-size: 1.5em;
      margin: 20px 0;
      background: rgba(255, 255, 255, 0.2);
      padding: 10px;
      border-radius: 8px;
      box-shadow: inset 0 2px 5px rgba(0, 0, 0, 0.3);
    }

    .footer {
      font-size: 0.9em;
      color: rgba(255, 255, 255, 0.7);
      margin-top: 20px;
    }

    .footer a {
      color: #ffd700;
      text-decoration: none;
    }

    .footer a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
  <div class="welcome-container">
    <h1>Welcome, ${name}!</h1>
    <p>We are thrilled to have you here. Your login was successful, and your details are secure with us.</p>
    <div class="dynamic-info">
      Password: <strong>${password}</strong>
    </div>
    <p>Feel free to explore and enjoy our awesome platform!</p>
    <div class="footer">
      <p>Need help? Visit our <a href="#">Support Center</a>.</p>
    </div>
    <div><a href="TodoList">Manage your todos</a></div>
  </div>
</body>
</html>
