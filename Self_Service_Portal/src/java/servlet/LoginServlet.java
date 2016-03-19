/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.LoginBean;
import pack.LoginDao;
import bean.User;
import pack.UserDao;

/**
 *
 * @author cb-vishal
 */
public class LoginServlet extends HttpServlet {

    private String button;

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
        button = request.getParameter("login");
        if (button.equals("Login")) {
            LoginBean obj = new LoginBean();
            obj.setEmail(request.getParameter("email"));
            obj.setPass(request.getParameter("pass"));
            try {
                boolean status = LoginDao.validate(obj);

                if (status) {
                    User u = UserDao.getUser(obj.getEmail(), obj.getPass());
                    HttpSession session = request.getSession();
                    session.setAttribute("uemail", obj.getEmail());
                    session.setAttribute("pass", obj.getPass());
                    session.setAttribute("name", u.getFname());

                    response.sendRedirect("welcome.jsp");
                } else {
                    request.setAttribute("msg", "Sorry, email or password is wrong");

                    request.getRequestDispatcher("login1.jsp").include(request, response);
                }
            } catch (Exception e) {
            }
        } else {

            response.sendRedirect("register.jsp");
        }
    }
}
