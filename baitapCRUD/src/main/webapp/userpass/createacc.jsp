<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/30/2021
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h2> Create </h2>
    <form action="/user?action=create" method="post">
        <table class="table">
            <tbody>
            <tr>
                <td><input placeholder="nhập id" name="id"></td>
                <td><input placeholder="nhập user" name="user"></td>
                <td><input placeholder="nhập pass" name="pass"></td>
                <td><input placeholder="nhập email" name="email"></td>
            </tr>

            </tbody>
        </table>
        <button type="submit" class="btn btn-success">Create Customer</button>

    </form>
</div>

</body>
</html>


