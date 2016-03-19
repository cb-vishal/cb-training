/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cb-vishal
 */
public class UserDao {

    public static void addAdress() {

    }

    public static User getUser(String email, String pass) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionProvider.getCon();

        PreparedStatement ps = con.prepareStatement(
                "select * from users where email=? and pass=?");

        ps.setString(1, email);
        ps.setString(2, pass);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User obj = new User();
        obj.setFname(rs.getString(2));
        obj.setLname(rs.getString(3));
        obj.setUemail(rs.getString(4));
        obj.setUpass(rs.getString(5));
        con.close();
        return obj;

    }

    
    
}
