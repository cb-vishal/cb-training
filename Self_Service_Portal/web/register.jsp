<%-- 
    Document   : index
    Created on : Dec 15, 2015, 3:55:55 PM
    Author     : cb-vishal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <style>
            #btn{
                width: 200px;
                height: 50px;
                background-color: red;
                color: white;
            }
        </style>
    </head>
    <body>

        <form action="RegisterServlet" method="post">  
            <center>  
                <h3>Register to</h3>
                <h2>Space Portal</h2>
                <input type="text" name="fname" value="First Name" onclick="this.value = ''"/><b>
                <input type="text" name="lname" value="Last Name" onclick="this.value = ''"/><br/><br/>
                <input type="text" name="uemail"  value="Email" onclick="this.value = ''"/><b>
                <input type="text" name="cuemail" value="Conform Email" onclick="this.value = ''"/><br/><br/>
                <input type="password" name="upass"  value="Password" onclick="this.value = ''"/>
                <input type="password" name="cupass"  value="Conform Password" onclick="this.value = ''"/><br/><br/>
                 
                <br/><input id="btn"  type="submit" value="Create an account"/><br/>
                <a href="login1.jsp">Have an account already?</a>
            </center>
        </form> 
       
    </body>
</html>
