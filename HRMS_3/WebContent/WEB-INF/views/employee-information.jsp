<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Data</title>
</head>
<body>
<h1>Employee Information</h1>

<h2>Employee Details</h2>
<p>Employee ID: ${employee.emplId}</p>
<p>Name: ${employee.emplFirstname} ${employee.emplLastname}</p>
<!-- Add other employee details as needed -->

<h2>Leave Information</h2>
<p>Total Number of Holidays: ${jobGradeHolidays.jbgr_totalnoh}</p>
<p>Total Number of Leaves Permitted: ${jobGradeLeaves.jbgr_totalnol}</p>
<!-- Add other leave-related information as needed -->

<h2>Opted Leaves</h2>
<table>
    <thead>
    <tr>
        <th>Date</th>
        <th>Leave Type</th>
    </tr>
    </thead>
    <tbody>
    <c:set var="usedHolidays" value="0" />
    <c:forEach var="leave" items="${optedLeaves}">
        <tr>
            <td>${leave.eolv_date}</td>
            <td>${leave.eolv_leavetype}</td>
            <c:if test="${leave.eolv_leavetype != 'MAND'}">
                <c:set var="usedHolidays" value="${usedHolidays + 1}" />
            </c:if>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h2>Holiday Usage Summary</h2>
<p>Used Holidays: ${usedHolidays}</p>
<p>Remaining Holidays: ${jobGradeHolidays.jbgr_totalnoh - usedHolidays}</p>
<p>Total Number of Holidays: ${jobGradeHolidays.jbgr_totalnoh}</p>

</body>
</html>