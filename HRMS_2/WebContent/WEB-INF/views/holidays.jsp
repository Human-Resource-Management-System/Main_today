<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@page import="models.Holiday" %>
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
                <th>Year</th>
                <th>Holiday Date</th>
                <th>Holiday Title</th>
                <th>Holiday Type</th>
            </tr>
        </thead>
        <tbody>
            <%
            List<Holiday> holidays = (List<Holiday>) request.getAttribute("holidays");
            if (holidays != null) {
                for (Holiday holiday : holidays) { %>
                    <tr>
                        <td><%= holiday.getYear() %></td>
                        <td><%= holiday.getHday_date() %></td>
                        <td><%= holiday.getHday_title() %></td>
                        <td><%= holiday.getHday_type() %></td>
                    </tr>
                <% }
            } %>
        </tbody>
    </table>
</body>
</html>