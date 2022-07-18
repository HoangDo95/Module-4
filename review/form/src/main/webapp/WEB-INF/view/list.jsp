<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="color: black; text-align: center">TỜ KHAI Y TẾ</h2>
<form>
    <span>${mess}</span>
    <a href="/create">Create</a>
    <table>
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Năm sinh</th>
            <th>Thông tin đi lại</th>
            <th>Ngày khởi hành</th>
            <th>Ngày kết thúc</th>
            <th>Thông tin 14 ngày qua</th>
            <th>Edit</th>
        </tr>
        <c:forEach items="${declareList}" var="declare">
            <tr>
                <td>${declare.stt}</td>
                <td>${declare.name}</td>
                <td>${declare.birthDay}</td>
                <td>${declare.move}</td>
                <td>${declare.starDay}</td>
                <td>${declare.outDay}</td>
                <td>${declare.other}</td>
                <td>
                    <a href="/edit?stt=${declare.stt}"><input type="button" value="Edit"></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
