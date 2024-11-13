<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Notes</title>
</head>
<body>
<h1>All Notes</h1>
<ul>
    <!-- Loop through each note in the list of notes passed from the controller -->
    <c:forEach var="note" items="${notes}">
        <li>
            <strong>${note.title}</strong> - ${note.content}
        </li>
    </c:forEach>
</ul>
</body>
</html>
