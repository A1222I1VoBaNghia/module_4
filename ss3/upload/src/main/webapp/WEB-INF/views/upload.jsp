<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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
                <form:input path="author"/>
            </td>
        </tr>
        <tr>
            <td>Format Song:</td>
            <td colspan="2">
                <form:checkboxes path="formatSong" items="${formatSongs}"/>
            </td>
        </tr>
        <tr>
            <td>Link:</td>
            <td colspan="2">
                <form:input path="link"/>
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
