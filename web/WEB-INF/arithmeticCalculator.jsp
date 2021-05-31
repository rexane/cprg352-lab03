<%-- 
    Document   : arithmeticCalculator
    Created on : May 27, 2021, 5:07:06 PM
    Author     : 785146
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
         <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first_num" value="${firstNum}">
            <br>
            <label>Second</label>
            <input type="text" name="second_num" value="${secondNum}">
            <br>
            <input type="submit" value="+" name="calculate">
            <input type="submit" value="-" name="calculate">
            <input type="submit" value="*" name="calculate">
            <input type="submit" value="%" name="calculate">
        </form>
        <p>Result: ${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
