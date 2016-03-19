/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bean.LoginBean;
import dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cb-vishal
 */
public class LoginServlet extends HttpServlet {

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

        LoginBean obj = new LoginBean();
        obj.setEmail(request.getParameter("email"));
        obj.setPass(request.getParameter("pass"));
        try {
            boolean status = LoginDao.validate(obj);

            if (status) {

                response.sendRedirect("edit_details.jsp");
            } else {
                request.setAttribute("msg", "Sorry, email or password is wrong");

                request.getRequestDispatcher("login1.jsp").include(request, response);
            }
        } catch (Exception e) {
        }
    }

}
