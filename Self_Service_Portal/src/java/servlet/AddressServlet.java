/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.AddressBean;
import pack.AddressDao;

/**
 *
 * @author cb-vishal
 */
public class AddressServlet extends HttpServlet {

    private String fname;
    private String lname;
    private String email;
    private String addLine1;
    private String addLine2;
    private String city;
    private String state;
    private String country;
    int zip;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            fname = request.getParameter("fname");
            lname = request.getParameter("lname");
            email = request.getParameter("uemail");
            addLine1 = request.getParameter("add_line1");
            addLine2 = request.getParameter("add_line2");
            city = request.getParameter("city");
            state = request.getParameter("state");
            country = request.getParameter("country");
            zip = Integer.parseInt(request.getParameter("zip"));
            AddressBean address = new AddressBean();
            address.setAddLine1(addLine1);
            address.setAddLine2(addLine2);
            address.setCity(city);
            address.setState(state);
            address.setCountry(country);
            address.setZip(zip);
            int id = AddressDao.addAddress(address);
            int status = AddressDao.addUserAddress(email, id);
            if (id > 0 && status > 0) {
                response.sendRedirect("address_success.jsp");

            } else {
                request.setAttribute("msg", "Record not inserted sql error!!!");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddressServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
