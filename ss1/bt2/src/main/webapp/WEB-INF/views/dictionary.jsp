<%--
  Created by IntelliJ IDEA.
  User: FPT Shop
  Date: 04/08/2023
  Time: 7:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/search">
  <h1>Translate Vietnamese</h1>
  <table>
    <tr>
      <td>Enter English word:</td>
      <td><input type="text" name="word" placeholder="English"></td>
      <td><input type="submit" value="translate"></td>
    </tr>
    <tr>
      <td>${trans}</td>
    </tr>
  </table>
</form>
</body>
</html>
