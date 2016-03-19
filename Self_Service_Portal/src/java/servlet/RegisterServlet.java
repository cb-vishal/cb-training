/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pack.RegisterDao;
import bean.User;

/**
 *
 * @author cb-vishal
 */
public class RegisterServlet extends HttpServlet {

    private String fname;
    private String lname;
    private String uemail;
    private String cuemail;
    private String upass;
    private String cupass;

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
        response.setContentType("text/html;charset=UTF-8");
        fname = request.getParameter("fname");
        lname = request.getParameter("lname");
        uemail = request.getParameter("uemail");
        cuemail = request.getParameter("cuemail");
        upass = request.getParameter("upass");
        cupass = request.getParameter("cupass");
        if (!uemail.equals(cuemail)) {
            request.setAttribute("msg", "Email should be same.");
            request.getRequestDispatcher("login1.jsp").forward(request, response);
        } else if (!upass.equals(cupass)) {
            request.setAttribute("msg", "Password should be same.");
            request.getRequestDispatcher("login1.jsp").forward(request, response);
        } else {
            try {
                User obj = new User();
                obj.setFname(fname);
                obj.setLname(lname);
                obj.setUemail(uemail);
                obj.setUpass(upass);

                int status = RegisterDao.register(obj);
                if (status > 0) {
                    response.sendRedirect("registersuccess.jsp");
                }

            } catch (Exception e) {
            }
        }

    }

}
