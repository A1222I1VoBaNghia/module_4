<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Song</title>
</head>
<body>
<h1>List Song</h1>
<a href="/upload">Upload Song</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name Song</th>
        <th>Author</th>
        <th>Format Song</th>
        <th>Link</th>
    </tr>
    <c:forEach items="${songs}" var="song">
        <tr>
            <td>${song.id}</td>
            <td>${song.nameSong}</td>
            <td>${song.author}</td>
            <td>${song.displayFormatSong()}</td>
            <td>${song.link}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
