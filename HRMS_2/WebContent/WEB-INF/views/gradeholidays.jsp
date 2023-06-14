<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@page import="models.GradeHoliday" %>
<%@ page import="java.util.List" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Holidays</title>

    <style>
        
        table {
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
        }
        
        th, td {
            padding: 5px 10px;
        }
        
        th {
            background-color: #333;
            color: #fff;
            font-weight: bold;
        }
        
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        
        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>

    <table>
        <thead>
            <tr>
                <th>JobGradeID</th>
                <th>Total No of Holidays</th>
            </tr>
        </thead>
        <tbody>
            <%
            List<GradeHoliday> gradeholidays = (List<GradeHoliday>) request.getAttribute("gradeholidays");
            if (gradeholidays != null) {
                for (GradeHoliday gradeholiday : gradeholidays) { %>
                    <tr>
                        <td><%= gradeholiday.getJbgr_id() %></td>
                        <td><%= gradeholiday.getJbgr_totalnoh()%></td>
                    </tr>
                <% }
            } %>
        </tbody>
    </table>
</body>
</html>