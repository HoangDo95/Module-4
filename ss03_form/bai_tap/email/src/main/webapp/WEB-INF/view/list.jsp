<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="edit" method="post">
    <table>
        <tr>
            <th>ID</th>
            <th>Language</th>
            <th>Page Size</th>
            <th>Filter</th>
            <th>Signature</th>
            <th>Edit</th>
        </tr>
        <c:forEach items="${emailList}" var="email">
            <tr>
                <td>${email.id}</td>
                <td>${email.language}</td>
                <td>${email.pageSize}</td>
                <td>${email.filter}</td>
                <td>${email.signature}</td>
                <td>
                    <a href="/edit?id=${email.id}"><input type="button" value="Edit"></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
