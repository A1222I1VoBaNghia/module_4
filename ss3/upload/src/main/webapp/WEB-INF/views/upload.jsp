<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BÀI TẬP 2</title>
</head>
<body>
<h1>UPLOAD</h1>
<form:form action="upload" method="post" modelAttribute="song">
    <table>
        <tr>
            <td>ID Song:</td>
            <td colspan="2">
                <form:input path="id"/>
            </td>
        </tr>
        <tr>
            <td>Name Song:</td>
            <td colspan="2">
                <form:input path="nameSong"/>
            </td>
        </tr>
        <tr>
            <td>Author:</td>
            <td colspan="2">
                <form:input path="singer"/>
            </td>
        </tr>
        <tr>
            <td>Category: </td>
            <td colspan="2">
                <form:input path="category"/>
            </td>
        </tr>
        <tr>
            <td>Link:</td>
            <td colspan="2">
                <c:choose>
                    <c:when test="${song.getFormatSong(song.link).equals('.mp3')}">
                        <form:input path="link"/>
                    </c:when>
                    <c:when test="${song.getFormatSong(song.link).equals('.wav')}">
                        <form:input path="link"/>
                    </c:when>
                    <c:when test="${song.getFormatSong(song.link).equals('.ogg')}">
                        <form:input path="link"/>
                    </c:when>
                    <c:when test="${song.getFormatSong(song.link).equals('.m4p')}">
                        <form:input path="link"/>
                    </c:when>
                    <c:otherwise>
                        <form:label path=>
                    </c:otherwise>
                </c:choose>

            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Upload">
            </td>
            <td>
                <input type="reset" value="Cancel">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
