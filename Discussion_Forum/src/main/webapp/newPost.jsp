<%-- 
    Document   : newPost
    Created on : Mar 2, 2017, 10:57:35 PM
    Author     : William Montesdeoca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <h1>Welcome: ${param.userName}</h1>
        <h3>Enter a new post or click the link to view thread</h3>
        <form action="submitPost" method="POST">
            <input type="hidden" name="username" value="${param.userName}">
            <textarea id="post" rows="10" cols="70" name="post"></textarea><br/>
            <input type="submit" value="Post">
        </form>
        <br>
        <form action="Logout" method="GET">
            <input type="submit" value="Logout" />
        </form>
        <br>
        <a href="thread.jsp">View Thread</a>
    </body>
</html>
