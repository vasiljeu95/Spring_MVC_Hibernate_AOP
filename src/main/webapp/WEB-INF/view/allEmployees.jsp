<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stepanvasilyeu
  Date: 08/09/2022
  Time: 01:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<!DOCTYPE html>--%>

<html>
    <head>
        <title>Employees</title>
    </head>

    <body>
        <h2>All Employees</h2>
        <br>

        <table>
            <tr>
                <th>Name</th>
                <th>SurName</th>
                <th>Department</th>
                <th>Salary</th>
                <th>Operations</th>
            </tr>

            <c:forEach var="emp" items="${allEmps}">
                <c:url var="updateButton" value="/updateInfo">
                    <c:param name="empId" value="${emp.id}"/>
                </c:url>

                <tr>
                    <td>${emp.name}</td>
                    <td>${emp.surName}</td>
                    <td>${emp.department}</td>
                    <td>${emp.salary}</td>
                    <td>
                        <input type="button" value="Update" onclick="window.location.href='${updateButton}'"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br>

        <input value="Add" onclick="window.location.href = 'addNewEmployee'" type="button"/>

    </body>
</html>
