<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Enter Induction Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }

        input[type="text"],
        input[type="date"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 14px;
            margin-bottom: 10px;
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
    <h1>Enter Induction Details</h1>
    <form method="post" action="success2">
        <label for="indcId">Induction ID:</label>
        <input type="text" name="indc_id" id="indc_id" required><br><br>
        
        <label for="emofId">Employment Offer ID:</label>
        <input type="text" name="indc_emof_id" id="indc_emof_id" required><br><br>
        
        <label for="indcDate">Induction Date:</label>
        <input type="date" name="indcDate" id="indcDate" required><br><br>
        
        <label for="processesAusrId">Processes Ausr ID:</label>
        <input type="text" name="indc_processes_ausr_id" id="indc_processes_ausr_id" required><br><br>
        
        <label for="indcStatus">Induction Status:</label>
        <input type="text" name="status" id="status" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
