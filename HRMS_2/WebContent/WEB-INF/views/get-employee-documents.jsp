<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Get Employee Documents</title>
</head>
<body>
    <h1>Get Employee Documents</h1>
    <form action="displaydocx" method="GET">
        <label for="erfd_id">Enter Employee ID:</label>
        <input type="text" id="erfd_id" name="erfd_id" required>
        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
