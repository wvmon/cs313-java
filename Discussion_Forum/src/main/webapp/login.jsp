<%-- 
    Document   : login
    Created on : Mar 2, 2017, 10:48:49 PM
    Author     : William Montesdeoca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CheckLogin" method="POST">
            Username: <input type="text" name="username" placeholder="username"><br/>
            Password: <input type="password" name="password" placeholder="password"><br/>
            <input type="submit" value="Login">
       </form>
    </body>
</html>
