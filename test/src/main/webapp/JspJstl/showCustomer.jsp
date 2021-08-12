<%@ page import="JspJstl.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/28/2021
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
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
        <%

            ArrayList<Customer> list = (ArrayList<Customer>) request.getAttribute("listCustomer");
            String str = "";
            for (Customer c : list) {
                str += "<tr> <td>" + c.getName() + "</td><td>" + c.getBirthday() + "</td><td>" + c.getAddress() +
                        "</td><td><img width='100' height='100' src ='" + c.getImage() + "'></td></tr>";
            }
           out.println(str);
        %>

        </tbody>
    </table>
</div>
<a href="JspJstl/createCustomer.jsp" class="btn btn-success">create</a>
</body>
</html>
