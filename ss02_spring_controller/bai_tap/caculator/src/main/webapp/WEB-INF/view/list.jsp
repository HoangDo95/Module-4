<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 14-Jul-22
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Calculator</h3>
<form method="post">
    <input type="number" name="num1" value="0">
    <input type="number" name="num2" value="0">
    <br>
    <button type="submit" name="operator" value="CONG">CONG (+)</button>
    <button type="submit" name="operator" value="TRU">TRU (-)</button>
    <button type="submit" name="operator" value="NHAN">NHAN (X)</button>
    <button type="submit" name="operator" value="CHIA">CHIA (/)</button>
<%--    <span><input type="submit" name="operator" value="CONG(+)"></span>--%>
<%--    <span><input type="submit" name="operator" value="TRU (-)"></span>--%>
<%--    <span><input type="submit" name="operator" value="NHAN (X)"></span>--%>
<%--    <span><input type="submit" name="operator" value="CHIA (/)"></span>--%>
</form>
<span>Result: ${result}</span>
</body>
</html>
