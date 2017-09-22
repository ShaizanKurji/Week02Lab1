<%-- 
    Document   : agejsp
    Created on : Sep 21, 2017, 2:06:12 PM
    Author     : 715060
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <form action ="agecalculator" method = "post">
           Enter your current age: <input type="number" name = "ageinput">
            <input type ="submit" value ="Age next birthday">
            
        </form>
        <br>
        ${agenext}
    </body>
</html>
