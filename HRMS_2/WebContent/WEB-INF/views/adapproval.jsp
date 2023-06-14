<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Approvals</title>
<style>
    
    h2 {
        color: #333;
        font-size: 24px;
        margin-bottom: 20px;
    }
    
    table {
        border-collapse: collapse;
        width: 100%;
    }

    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: #f2f2f2;
    }

    tr:hover {
        background-color: #f5f5f5;
    }
</style>
</head>
<body>
<h2>Approvals</h2>
<table>
            <thead>
                <tr>
                    <th>Employee ID</th><br>
                    <th>Date</th><br>
                    <th>Leave Type</th><br>
                    
                </tr>
            </thead>
            <tbody>
                <%-- Iterate over the list of employees and display the data --%>
                <%  %>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        
                    </tr>
                <%  %>
            </tbody>
        </table><br>
<h2>Permissions</h2>       
        <table>
            <thead>
                <tr>
                    <th>Employee ID</th><br>
                    <th>Date</th><br>
                    <th>Permission</th><br>
                    
                </tr>
            </thead>
            <tbody>
                <%-- Iterate over the list of employees and display the data --%>
                <%  %>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        
                    </tr>
                <%  %>
            </tbody>
        </table><br>
</body>
</html>