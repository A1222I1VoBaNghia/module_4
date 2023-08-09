<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>CALCULATOR</h1>
<form action="/calculator/cal" method="post">
  <table>
    <tr>
      <td colspan="2">
        <input type="number" name = "a">
      </td>
      <td colspan="2">
        <input type="number" name = "b">
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit" name="cal" value="Addition">
      </td>
      <td>
        <input type="submit" name="cal" value="Subtraction">
      </td>
      <td>
        <input type="submit" name="cal" value="Multiplication">
      </td>
      <td>
        <input type="submit" name="cal" value="Division">
      </td>
    </tr>
  </table>
  <p> Result ${a} ${cals} ${b}: ${results}</p>
</form>
</body>
</html>
