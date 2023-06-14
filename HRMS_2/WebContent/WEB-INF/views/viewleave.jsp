<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Leave List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Leave List</h1>
    <table>
        <tr>
            <th>Employee ID</th>
            <th>Request Date</th>
            <th>Leave Type</th>
            <th>Reason</th>
            <th>Leave Start Date</th>
            <th>Leave End Date</th>
        </tr>
        <!-- Iterate over the leaves list and generate table rows -->
        <c:forEach items="${leaves}" var="leave">
            <tr>
                <td>${leave.employeeId}</td>
                <td>${leave.requestDate}</td>
                <td>${leave.leaveType}</td>
                <td>${leave.reason}</td>
                <td>${leave.leaveStartDate}</td>
                <td>${leave.leaveEndDate}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>