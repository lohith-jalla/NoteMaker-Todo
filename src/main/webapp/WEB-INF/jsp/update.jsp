<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Note</title>
</head>
<body>

<h2>Update Note</h2>

<!-- Display an error message if the note doesn't exist -->
<c:if test="${not empty error}">
    <p style="color: red;">${error}</p>
</c:if>

<form action="/update" method="post">
    <input type="hidden" name="_method" value="patch"/>
    <input type="hidden" name="id" value="${param.id}" />

    <label for="title">Title:</label>
    <input type="text" id="title" name="title" value="${note.title}" required/><br/><br/>

    <label for="content">Content:</label>
    <textarea id="content" name="content" required>${note.content}</textarea><br/><br/>

    <button type="submit">Update Note</button>
</form>

</body>
</html>
