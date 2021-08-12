<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/27/2021
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Currency Converter</h1>
<form action="convert1.jsp" method="post">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="23000"/><br/>

    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>

    <button type="submit">Converter</button>
</form>
</body>
</html>
