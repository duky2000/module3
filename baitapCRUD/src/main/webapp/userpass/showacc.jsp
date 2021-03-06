<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/30/2021
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">


    <h2>Show </h2>
    <a href="/user?action=create" class="btn btn-success">Create</a>

    <br>
    <br>
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>User</th>
            <th>Pass</th>
            <th>Email</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${newacc}" var="user" varStatus="loop">
            <tr>
                <td>${user.id}</td>
                <td>${user.user}</td>
                <td>${user.pass}</td>
                <td>${user.email}</td>
                <td><a href="/user?action=edit&index=${loop.index}" class="btn btn-warning">Edit</a></td>
                <td><a href="/user?action=delete&index=${loop.index}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>

</body>
</html>

