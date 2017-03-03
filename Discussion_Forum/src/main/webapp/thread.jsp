<%-- 
    Document   : thread
    Created on : Mar 2, 2017, 10:58:25 PM
    Author     : William Montesdeoca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/mootools/1.2.4/mootools-yui-compressed.js"></script>

        <script type="text/javascript">
            //This event is called when the DOM is fully loaded
            window.addEvent("domready",function(){
                //Creating a new AJAX request that will request 'test.csv' from the current directory
                var post = new Request({
                    url:"discussion.txt",
                    onSuccess:function(response){
                        //The response text is available in the 'response' variable
                        //Set the value of the textarea with the id 'csvResponse' to the response
                        console.log(response);
                        document.getElementById("threadTable").innerHTML = response;
                    }
                }).send(); //Don't forget to send our request!
            });
        </script>
    </head>
    <body>
         <h1>Discussion Board</h1>
        <h3>User posts will be displayed here</h3>
         <table id="threadTable">
            
        </table>
        <a href="newPost.jsp">Make New Post</a>
    </body>
</html>
