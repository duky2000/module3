<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/27/2021
  Time: 9:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product Discount demoWeb.Calculator</h1>
<form action="/display" method="post">
    <div>
        <p>miêu tả: <input type="text" name="mieuta" placeholder="nhập mô tả"></p>
    </div>
    <div>
        <p>giá : <input type="text" name="gia" placeholder="Product price"></p>
    </div>
    <div>
        <p>% triết khấu : <input type="text" name="phantram" placeholder="Discount Percent"></p>
    </div>
    <br>
    <input type="submit" id="submit" value="tính triết khấu">
</form>
</body>
</html>
