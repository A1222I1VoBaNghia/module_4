<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>SANDWICH COMDIMENTS</h1>
<c:if test="${selected!=null}">
  <strong>Your selected:
    <c:forEach items="${selected}" var="e">${e} </c:forEach>
  </strong>
</c:if>
<form action="/sandwich/choose" method="post">
  <input type="checkbox" name="comdiments" value="Lettuce" id="Lettuce">Lettuce
  <input type="checkbox" name="comdiments" value="Tomato" id="Tomato">Tomato
  <input type="checkbox" name="comdiments" value="Mustart" id="Mustart">Mustart
  <input type="checkbox" name="comdiments" value="Sprouts" id = "Sprouts">Sprouts
  <hr/>
  <input value="Save" type="submit">
</form>
</body>
</html>
