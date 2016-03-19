/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Address;
import bean.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pack.ConnectionProvider;

/**
 *
 * @author cb-vishal
 */
public class PersonDao {

    public static int addRecord(Person person) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        String sql1 = "insert into person(name,addline1,addline2,city,state,country,zip) values(?,?,?,?,?,?,?)";
        String sql2 = "insert into person_phone values(?,?,?)";
        Connection con = ConnectionProvider.getCon();
        PreparedStatement ps1 = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
        PreparedStatement ps2 = con.prepareStatement(sql2);
        Address address = (Address) person.getAddress();
        ps1.setString(1, person.getname());
        ps1.setString(2, address.getAddLine1());
        ps1.setString(3, address.getAddLine2());
        ps1.setString(4, address.getCity());
        ps1.setString(5, address.getState());
        ps1.setString(6, address.getCountry());
        ps1.setString(7, address.getZip());
        int status = ps1.executeUpdate();
        ResultSet rs = ps1.getGeneratedKeys();
        rs.next();
        int id = rs.getInt(1);

       ps2.setString(1, person.getHome());
        ps2.setString(2, "home");
        ps2.setInt(3, id);
        ps2.executeUpdate();
        ps2.setString(1, person.getWork());
        ps2.setString(2, "work");
        ps2.setInt(3, id);
        ps2.executeUpdate();
        ps2.setString(1, person.getMobile());
        ps2.setString(2, "mobile");
        ps2.setInt(3, id);
        ps2.executeUpdate();
        con.close();

        return status;
    }

    public static List<Person> getRecords() throws ClassNotFoundException, SQLException  {
        List<Person> list = new ArrayList<Person>();
        Connection con = ConnectionProvider.getCon();
        PreparedStatement stmt1 = con.prepareStatement("select * from person");
        ResultSet rs = stmt1.executeQuery();
        //Person person = new Person();
        Address address = new Address();
        while (rs.next()) {
            Person person = new Person();
            int id = rs.getInt(1);
            person.setName(rs.getString(2));
            address.setAddLine1(rs.getString(3));
            address.setAddLine2(rs.getString(4));
            address.setCity(rs.getString(5));
            address.setState(rs.getString(6));
            address.setCountry(rs.getString(7));
            address.setZip(rs.getString(8));
            person.setAddress(address);
            PreparedStatement stmt2 = con.prepareStatement("select * from person_phone where p_id=" + id + "");
            ResultSet rs2 = stmt2.executeQuery();
            while (rs2.next()) {
                if (rs2.getString(2).equals("home")) {
                    person.setHome(rs2.getString(1));
                }
                if (rs2.getString(2).equals("work")) {
                    person.setWork(rs2.getString(1));
                }
                if (rs2.getString(2).equals("mobile")) {
                    person.setMobile(rs2.getString(1));
                }
            }

            list.add(person);
        }
        con.close();

        return list;

    }
  public static void main(String ar[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
  {
      Person p=new Person();
      Address a=new Address();
      p.setName("abc");
      a.setAddLine1("gf");
      a.setAddLine2("hask");
      a.setCity("ae");
      a.setCountry("uyeru");
      a.setState("ahk");
      a.setZip("24364");
      p.setAddress(a);
      p.setMobile("86743");
      p.setHome("735785");
      p.setWork("9876");
      System.out.println(addRecord(p));
  }
}
