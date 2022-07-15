<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 15-Jul-22
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="number" required name="num1" value="${num1}">
    <input type="number" required name="num2" value="${num2}">
    <br>
    <button type="submit" name="item" value="cong">Cong</button>
    <button type="submit" name="item" value="tru">Tru</button>
    <button type="submit" name="item" value="nhan">Nhan</button>
    <button type="submit" name="item" value="chia">Chia</button>
</form>
<span>Result: ${result}</span>
</body>
</html>
