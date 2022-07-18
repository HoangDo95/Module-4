<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 18-Jul-22
  Time: 2:44 PM
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
<form:form action="/edit" method="post" modelAttribute="declare">
    <table>
        <tr>
            <td>STT:</td>
            <td>
                <form:hidden path="stt"/>
            </td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>Nam sinh:</td>
            <td>
                <form:select path="birthDay" items="${birthDayList}"/>
            </td>
        </tr>
        <tr>
            <td>Di chuyen:</td>
            <td>
                <form:radiobuttons path="move" items="${moveList}"/>
            </td>
        </tr>
        <tr>
            <td>Ngay bat dau:</td>
            <td>
                <form:select path="starDay" items="${starDayList}"/>
            </td>
        </tr>
        <tr>
            <td>Ngay ket thuc:</td>
            <td>
                <form:select path="outDay" items="${endDayList}"/>
            </td>
        </tr>
        <tr>
            <td>14 ngay qua:</td>
            <td><form:input path="other"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Edit</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
