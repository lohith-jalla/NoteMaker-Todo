<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Note</title>
</head>
<body>

<h2>Delete Note</h2>

<!-- Display an error message if the note doesn't exist -->
<c:if test="${not empty error}">
    <p style="color: red;">${error}</p>
</c:if>

<p>Are you sure you want to delete this note?</p>

<!-- Confirmation form for deleting the note -->
<form action="/deleteById" method="post">
    <input type="hidden" name="_method" value="delete"/>
    <input type="hidden" name="id" value="${param.id}" />

    <button type="submit">Yes, Delete</button>
    <a href="/AllNotes">Cancel</a>
</form>

</body>
</html>
