<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BÀI TẬP 1</title>
</head>
<body>
<h1>Setting</h1>
  <form:form action="setting" method="post" modelAttribute="setting">
    <form:hidden path="id"/>
    <table>
      <tr>
        <td>Language:</td>
        <td colspan="2">
          <form:select path="languages" items="${languages}"></form:select>
        </td>
      </tr>
      <tr>
        <td>Page Sizes:</td>
        <td colspan="2">
          Show <form:select path="pageSize" items="${pageSizes}"></form:select> email per page
        </td>
      </tr>
      <tr>
        <td>Spams Filter:</td>
        <td colspan="2">
          <form:checkbox path="spamsFilter"></form:checkbox> Enable spam filter
        </td>
      </tr>
      <tr>
        <td>Signature:</td>
        <td colspan="2">
          <form:textarea path="signature"></form:textarea>
        </td>
      </tr>
      <tr>
        <td></td>
        <td>
          <input type="submit" value="Update">
        </td>
        <td>
          <input type="reset" value="Cancel">
        </td>
      </tr>
    </table>
  </form:form>
</body>
</html>
