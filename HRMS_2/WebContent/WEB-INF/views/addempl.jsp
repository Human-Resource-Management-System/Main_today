<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
</head>
<body>
    <h1>Employee Form</h1>
    <form action="insertEmployee.jsp" method="post">
        <label for="emplId">Employee ID:</label>
        <input type="text" name="emplId" id="emplId" required><br>
        
        <label for="emplFirstname">First Name:</label>
        <input type="text" name="emplFirstname" id="emplFirstname" required><br>
        
        <label for="emplLastname">Last Name:</label>
        <input type="text" name="emplLastname" id="emplLastname" required><br>
        
        <label for="emplSurname">Surname:</label>
        <input type="text" name="emplSurname" id="emplSurname" required><br>
        
        <label for="emplRmanagerEmplId">Reporting Manager ID:</label>
        <input type="text" name="emplRmanagerEmplId" id="emplRmanagerEmplId"><br>
        
        <label for="emplHrEmplId">HR Employee ID:</label>
        <input type="text" name="emplHrEmplId" id="emplHrEmplId"><br>
        
        <label for="emplJbgrId">Job Group ID:</label>
        <input type="text" name="emplJbgrId" id="emplJbgrId"><br>
        
        <label for="emplPhoto">Photo:</label>
        <input type="text" name="emplPhoto" id="emplPhoto"><br>
        
        <label for="emplJondate">Joining Date:</label>
        <input type="date" name="emplJondate" id="emplJondate"><br>
        
        <label for="emplDob">Date of Birth:</label>
        <input type="date" name="emplDob" id="emplDob"><br>
        
        <label for="emplDesignation">Designation:</label>
        <input type="text" name="emplDesignation" id="emplDesignation"><br>
        
        <label for="emplOffemail">Official Email:</label>
        <input type="text" name="emplOffemail" id="emplOffemail"><br>
        
        <label for="emplPemail">Personal Email:</label>
        <input type="text" name="emplPemail" id="emplPemail"><br>
        
        <label for="emplMobile">Mobile Number:</label>
        <input type="text" name="emplMobile" id="emplMobile"><br>
        
        <label for="emplAlemail">Alternate Email:</label>
        <input type="text" name="emplAlemail" id="emplAlemail"><br>
        
        <label for="emplBloodgroup">Blood Group:</label>
        <input type="text" name="emplBloodgroup" id="emplBloodgroup"><br>
        
        <label for="emplGender">Gender:</label>
        <input type="text" name="emplGender" id="emplGender"><br>
        
        <label for="emplAddress">Address:</label>
        <textarea name="emplAddress" id="emplAddress"></textarea><br>
        
        <label for="emplFname">Father's Name:</label>
        <input type="text" name="emplFname" id="emplFname"><br>
        
         <label for="EmplLuudate">EmplLuudate:</label>
        <input type="date" name="EmplLuudate" id="EmplLuudate"><br>
        
         <label for="EmplLuuser">EmplLuuser:</label>
        <input type="text" name="EmplLuuser" id="EmplLuuser"><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
