<%-- 
    Document   : edit_details
    Created on : Dec 16, 2015, 5:18:23 PM
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
            input{
                //margin-left: 500px;
            }
            #btn{
                width: 100px;
                height: 35px;
                background-color: red;
                color: white;
            }
        </style>
    </head>
    <body>
        <form action="AddressServlet" method="post">
            <center>
                <h1> Edit Details</h1>
                Name<input type="text" name="fname" size='10'/>
                <input type="text" name="lname" size='10'/><br/><br/>
                Email<input type="text" name="uemail" size='25'/><br/><br/>
                Address<input type="text" name="add_line1" size='25' value="Address Line1" onclick="this.value = ''"/><br/><br/>
                <input type="text" name="add_line2" size='25' value="Address Line2" onclick="this.value = ''"/><br/><br/>
                <input type="text" name="city" value="City" size='10' onclick="this.value = ''"/><b>
                    <select name="state">
                        <option value="state">State</option>
                        <option value="bihar">Bihar</option>
                        <option value="tamilnadu">TamilNadu</option>
                        <option value="keral">Keral</option>
                    </select> <br/>
                    <input type="text" name="zip" value="Zip" size='10' onclick="this.value = ''"/><b>
                        <select name="country">
                            <option value="country">Country</option>
                            <option value="india">India</option>
                            <option value="pakistan">pakistan</option>
                            <option value="dubai">Dubai</option>
                            <option value="america">America</option>
                        </select> <br/><br/>
                        <input id='btn' type="submit" name="save" value="Save Details"/><b><b>
                                <a href="welcome.jsp">Discard</a>
                                </center>
                                </form>

                                </body>
                                </html>
