<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 15-Jul-22
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit</h1>
<form:form action="/edit" method="post" modelAttribute="email">
    <table>
        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>languages:</td>
            <td><form:select path="language" items="${sList}"/></td>
        </tr>
        <tr>
            <td>Pages size:</td>
            <td>
                <span>Show</span>
                <form:select path="pageSize" items="${iList}"/>
                <span>email per page</span>
            </td>
        </tr>
        <tr>
            <td>Spams filter:</td>
            <td>
                <form:checkbox path="filter"/>
                <span>Enable spams filter</span>
            </td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Edit</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
