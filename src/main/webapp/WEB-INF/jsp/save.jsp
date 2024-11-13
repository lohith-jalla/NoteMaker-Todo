<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create New Note</title>
</head>
<body>

<h2>Create New Note</h2>

<!-- Display an error message if there's any issue with creating the note -->
<c:if test="${not empty error}">
    <p style="color: red;">${error}</p>
</c:if>

<form action="/createNote" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required /><br/><br/>

    <label for="content">Content:</label>
    <textarea id="content" name="content" required></textarea><br/><br/>

    <button type="submit">Create Note</button>
</form>

<a href="/AllNotes">Back to All Notes</a>

</body>
</html>
