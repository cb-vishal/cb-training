<%-- 
    Document   : allcontact
    Created on : Jan 3, 2016, 12:57:31 AM
    Author     : cb-vishal
--%>
<%@page import="bean.Address"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.PersonDao"%>
<%@page import="bean.Person"%>
<%
    Person person;
    List<Person> list = PersonDao.getRecords();
    Iterator it = list.iterator();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="border.jsp"></jsp:include>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
            <style>
                tr:nth-child(even) {background: #CCC}
                tr:nth-child(odd) {background: #FFF}
                #container{
                    margin-left: 250px;
                  // margin-top: 50px;
                }
               
                
                .table1 tr { line-height: 40px;}
                
                thead th { text-align:center; background:green; color:white ;
                           padding: 0px;
                }
                tbody td{
                    padding: 10px;
                }
  
                
            </style>
        </head>
        <body>

            <div id="container">
                
                <h2 >All Contacts</h2>
                <table class="table1">
                    <div class="b" > 
                    <thead>
                      
                        <tr >
                            <th>&nbsp;Name<br></th>
                            <th>Address<br></th>
                            <th colspan="3">Phone<br></th>



                        </tr>
                    
                    </thead>
                     </div>
                    <tbody>
                    <%
                        while (it.hasNext()) {
                            person = (Person) it.next();
                            Address address = person.getAddress();


                    %>

                    <tr>

                        <td align="left"><%=person.getname()%></td>
                        <td align="center"><%=address.toString()%></td>
                        <td align="center"> <%=person.getWork()%>(work)</td>
                        <td align="center"><%=person.getHome()%>(home)</td>
                        <td align="center"><%=person.getMobile()%>(mobile)</td>


                    </tr>
                    <% }%> 

                </tbody>
            </table>
            </div>
                    
    </body>
</html>
