<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Setting</title>
</head>
<body>
<h1>List setting</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Languages</th>
        <th>Page Sizes</th>
        <th>Spams Filters</th>
        <th>Signature</th>
        <th>Edit</th>
    </tr>
    <c:forEach items="${setting}" var="setting">
        <tr>
            <td>${setting.id}</td>
            <td>${setting.languages}</td>
            <td>${setting.pageSize}</td>
            <td>${setting.spamsFilter}</td>
            <td>${setting.signature}</td>
            <td>
                <a href="/setting?id=${setting.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
