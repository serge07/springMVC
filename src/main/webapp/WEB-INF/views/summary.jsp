<%--
  Created by IntelliJ IDEA.
  User: serge
  Date: 3/16/2025
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Summary Page</title>
</head>
<body>
   <h1> Form Submission Summary</h1>
   <p><strong>Name:</strong>${user.username}</p>
   <p><strong>Email:</strong>${user.email}</p>
   <p><strong>Age:</strong>${user.age}</p>
   <br>
   <a href="/index">Back to Form</a>

</body>
</html>
