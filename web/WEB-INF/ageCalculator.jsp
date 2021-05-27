<%-- 
    Document   : ageCalculator
    Created on : May 27, 2021, 4:16:45 PM
    Author     : 785146
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="${age}" placeholder="18">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</P>
    </body>
</html>
