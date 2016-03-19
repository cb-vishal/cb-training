<%@page import="bean.User"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%
    User u = (User) session.getAttribute("obj");
%>
<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            div.hidden{


                background-color: blue;
                background-position: top;

                // vertical-align:middle;

                height: 40px;    
            } 
            h3 {
                display:inline;

                vertical-lign:middle;
                margin:10px;
            }
            #one{

                float:right;
            }
            #two{

                float: right;

            }
            #three{

                float: right;
            }


        </style>
    </head>
    <body>
        <div class="hidden"><h3>Space Portal</h3>
            <h3 id='three'><a href="logout.jsp">logout</a></h3>
            <h3 id='two'> Deactivate Account</h3>
            <h3 id='one'><%="hi " + session.getAttribute("name")%></h3>


        </div>  

    </body>
</html>
