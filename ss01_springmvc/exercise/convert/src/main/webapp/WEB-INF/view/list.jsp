<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 13-Jul-22
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label>Rate: </label>
    <input type="number" name="rate" required placeholder="Rate" value="0"><br>
    <label>USD: </label>
    <input type="number" name="usd" required placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
</form>
<span>KQ = ${vnd}</span>
</body>
</html>
