<%-- 
    Document   : login1
    Created on : Dec 17, 2015, 2:59:05 PM
    Author     : cb-vishal
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script type="text/javascript" src="validate.js"></script> 
        <style>
            div{
                float: top;
                margin-top:100px;
                margin-left:450px;
                width: 400px;
                height: 500px;
                background: burlywood;

            }
            input{
                height: 35px;
                width: 120px
            }
            #reg{
                float: bottom;
                width: 300px;
                height: 50px;
                background-color: blue;
                color: white;

            }
            #bt{
                background-color: crimson;
                color: white;
            }
            p{
                color: red;
            }
        </style>
    </head>
    <body>
        <div>
            <form name="myform" action="LoginServlet" method="post" onsubmit="return validateform()">  

                <center>
                    <h1>Phone Directory</h1>
                    <h3>Login</h3><br/>
                    <p>
                        <%
                            String msg = (String) request.getAttribute("msg");
                            if (msg != null) {
                                out.print(msg);
                            }%></p>
                    Email:<input type="text"  name="email"/><br/><br/>  
                    Password:<input type="password"   name="pass"/><br/><br/>  
                    <input id='bt' type="submit" name="login" value="Login"/><b><br/>
                        <a href="">Don't remember your password?</a>
                        
                        
                        
                </center>

            </form>
        </div>
    </body>
</html>
