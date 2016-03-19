<%-- 
    Document   : welcome
    Created on : Dec 17, 2015, 4:19:12 PM
    Author     : cb-vishal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="border.jsp"></jsp:include>

    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
            <style>
                p,h3{
                    display: inline;
                }
                p{
                    margin-left: 500px;
                }
                h1{
                    color: darkslateblue;
                }
                input{
                    width: 100px;
                    height: 35px;
                    background-color: red;
                    color: white
                }
            </style>
        </head>
        <body>

            <form action="edit_details.jsp" method="post">

                <br/>
                <center>
                    <h1>Welcome to the space portal</h1><br/><br/>
                </center>
                <p>Name:</p><h3><%=session.getAttribute("name")%></h3><br/>
            <p>Email:</p><h3><%=session.getAttribute("uemail")%></h3><br/>
            <p>Address:</p><h3>..NA..</h3><br/><br/>
            <center>
                <input type='submit' name='edit' value='Edit details'/>

            </center>          
        </form>
    </body>
</html>