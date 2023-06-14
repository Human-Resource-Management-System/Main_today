<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
    }

    .form-container {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        background-color: #fff;
        border: 1px solid #ddd;
        border-radius: 4px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    h1 {
        text-align: center;
        color: #333;
    }

    form {
        margin-top: 20px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        color: #333;
    }

    input[type="text"],
    input[type="date"],
    textarea {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        font-size: 14px;
        margin-bottom: 10px;
    }

    select {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        font-size: 14px;
        margin-bottom: 10px;
    }

    textarea {
        height: 80px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 14px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
 <div class="form-container">
        <h1>Leave Page</h1>
        <form action="create" method="post">
            <label for="employeeId">Employee ID:</label>
            <input type="text" id="employeeId" name="employeeId"><br><br>
            
            <label for="requestDate">Request Date:</label>
            <input type="date" id="requestDate" name="requestDate"><br><br>
            
            <label for="leaveType">Leave Type:</label>
            <select id="leaveType" name="leaveType">
                <option value="CASL">CASL</option>
                <option value="SICK">SICK</option>
                <option value="OTHR">OTHR</option>
                <option value="FEST">FEST</option>
                <option value="TRIP">TRIP</option>
            </select><br><br>
            
            <label for="reason">Reason:</label>
            <textarea id="reason" name="reason"></textarea><br><br>
            
            <label for="leaveStartDate">Leave Start Date:</label>
            <input type="date" id="leaveStartDate" name="leaveStartDate"><br><br>
            
            <label for="leaveEndDate">Leave End Date:</label>
            <input type="date" id="leaveEndDate" name="leaveEndDate"><br><br>
               
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>