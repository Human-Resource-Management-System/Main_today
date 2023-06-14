<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.EmployeeRedocuments" %>
<html>
<head>
    <title>Display Employee Documents</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #333;
            margin-bottom: 30px;
            text-align: center;
        }

        h2 {
            color: #333;
            margin-top: 40px;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
            color: #333;
            text-transform: uppercase;
        }

        .document-preview {
            margin-top: 20px;
            width: 100%;
            max-width: 500px;
            height: 400px;
            display: flex;
            justify-content: center;
            align-items: center;
         }

    </style>
</head>
<body>
    <h1>Employee Documents</h1>
    <% 
    EmployeeRedocuments employeeRedocuments = (EmployeeRedocuments) request.getAttribute("employeeRedocuments");
    String imagePath = request.getContextPath() + "/";%>
   
    <h2>Document Details</h2>
    <table>
        <tr>
            <th>Document Id</th>
            <th>Category</th>
            <th>Description</th>
            <th>Last Updated Date</th>
            <th>Last Updated By</th>
        </tr>
        <tr>
             <td><%= employeeRedocuments.getErfdId() %></td>
            <td><%= employeeRedocuments.getDocumentName() %></td>
            <td><%= employeeRedocuments.getCategory() %></td>
            <td><%= employeeRedocuments.getLuuDate() %></td>
            <td><%= employeeRedocuments.getLuser() %></td>
        </tr>
    </table>
    
    <h2>Document Preview</h2>
    <div class="document-preview">
        <embed src="<%= imagePath + employeeRedocuments.getDescription() %>" width="100%" height="100%" />
    </div>
</body>
</html>
