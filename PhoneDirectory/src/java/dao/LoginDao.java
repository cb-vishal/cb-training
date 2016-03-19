/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LoginBean;
import java.sql.*;
import pack.ConnectionProvider;

public class LoginDao {

    public static boolean validate(LoginBean bean) throws Exception {
        boolean status = false;
        
        
            Connection con = ConnectionProvider.getCon();

            PreparedStatement ps = con.prepareStatement(
                    "select * from users where email=? and pass=?");

            ps.setString(1, bean.getEmail());
            ps.setString(2, bean.getPass());

            ResultSet rs = ps.executeQuery();
            status=rs.next();
            //if(rs==null || !rs.first())
                //return false;
            con.close();
        return status;

    }
    public static void main(String ar[]) throws Exception
    {
        LoginBean o=new LoginBean();
        o.setEmail("vishal@gmail.com");
        o.setPass("12345");
        System.out.println(LoginDao.validate(o));
      System.out.println(LoginDao.validate(o));
    }
}
