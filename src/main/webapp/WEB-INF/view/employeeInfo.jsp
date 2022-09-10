<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: stepanvasilyeu
  Date: 08/09/2022
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add Employee</title>
    </head>

    <body>
        <h2>Employee Info</h2>
        <br>

        <form:form modelAttribute="employee" action="saveEmployee">
            <form:hidden path="id"/>

            Name <form:input path="name"/>
            <form:errors path="name"/>
            <br><br>

            Surname <form:input path="surName"/>
            <form:errors path="surName"/>
            <br><br>

            Department <form:input path="department"/>
            <form:errors path="department"/>
            <br><br>

            Salary <form:input path="salary"/>
            <form:errors path="salary"/>
            <br><br>

            <input type="submit" value="OK">
        </form:form>

    </body>
</html>
