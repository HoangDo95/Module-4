<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div>
    <h1>List Declaration</h1>
    <table class="table table-striped table-inverse table-responsive col-lg-12">
        <thead class="thead-inverse col-lg-12">
        <tr>
            <th>
                <a href="/create">Create</a>
            </th>
        </tr>
        <tr class="col-lg-12">
            <th>ID</th>
            <th>Name</th>
            <th>BirthYear</th>
            <th>Gender</th>
            <th>national</th>
            <th>idCard</th>
            <th>transportType</th>
            <th>transportId</th>
            <th>seat</th>
            <th>inputDay</th>
            <th>inputMonth</th>
            <th>inputYear</th>
            <th>outDay</th>
            <th>outMonth</th>
            <th>outYear</th>
            <th>other</th>
            <th>Edit</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${declarationList}" var="item">
            <tr class="col-lg-12">
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.birthYear}</td>
                <td>${item.gender}</td>
                <td>${item.national}</td>
                <td>${item.idCard}</td>
                <td>${item.transportType}</td>
                <td>${item.transportId}</td>
                <td>${item.seat}</td>
                <td>${item.inputDay}</td>
                <td>${item.inputMonth}</td>
                <td>${item.inputYear}</td>
                <td>${item.outDay}</td>
                <td>${item.outMonth}</td>
                <td>${item.outYear}</td>
                <td>${item.other}</td>
                <td>
                    <a href="/edit?id=${item.id}"><input type="button" value="Edit"></a>

                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</html>