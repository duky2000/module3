<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/28/2021
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!  Map<String, String> dictionary = new HashMap<>();%>
<%dictionary.put("hello", "Xin chào");
    dictionary.put("how", "Thế nào");
    dictionary.put("book", "Quyển vở");
    dictionary.put("computer", "Máy tính");

    String search = request.getParameter("search");

    PrintWriter writer = response.getWriter();

    String result = dictionary.get(search);
    if(result != null){
        writer.println(" từ : " + search);
        writer.println("kết quả : " + result);
    } else {
        writer.println("không thấy");
    }%>
    </body>
</html>
