<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/28/2021
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customer" method="post">

    <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th>Họ và Tên</th>
                <th>Ngày sinh</th>
                <th>Địa chỉ</th>
                <th>Ảnh</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" placeholder="nhập tên" name="name"></td>
                <td><input type="text" placeholder="nhập ngày tháng năm" name="day"></td>
                <td><input type="text" placeholder="nhập địa chỉ" name="address"></td>
                <td><input type="text" placeholder="nhập ảnh" name="img"></td>
            </tr>
            </tbody>
        </table>
    </div>
    <button type="submit" class="btn btn-success">create</button>
</form>
</body>
</html>
