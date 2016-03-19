/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bean.Address;
import bean.Person;
import dao.PersonDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cb-vishal
 */
public class EditServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Person person=new Person();
            Address address=new Address();
            person.setName(request.getParameter("fname")+" "+request.getParameter("lname"));
            address.setAddLine1(request.getParameter("add_line1"));
            address.setAddLine2(request.getParameter("add_line2"));
            address.setCity(request.getParameter("city"));
            address.setState(request.getParameter("state"));
            address.setCountry(request.getParameter("country"));
            address.setZip(request.getParameter("zip"));
            person.setAddress(address);
            person.setHome(request.getParameter("home"));
            person.setWork(request.getParameter("work"));
            person.setMobile(request.getParameter("mobile"));
        try {
            if(PersonDao.addRecord(person)>0)
                response.sendRedirect("allcontact.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        
       
    }
    
    }

 