<html>

<head>
    <title>Welcome Page</title>
</head>
<body>
<h2>Welcome to the page</h2>

<form action="/submit" method="post">
    <label for="name">Name:</label>
    <input type="text" id = "name" name="name" required><br></br>

    <label for="email">Email:</label>
    <input type="email" id = "email" name="email" required><br></br>

    <label for="age">Age:</label>
    <input type="number" id = "age" name="age" required><br></br>

    <input type="submit" value="Submit">

</form>
</body>
</html>
