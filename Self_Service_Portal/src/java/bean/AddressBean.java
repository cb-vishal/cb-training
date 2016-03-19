/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author cb-vishal
 */
public class AddressBean {
    private String addLine1;
    private String addLine2;
    private String city;
    private String state;
    private String country;
    private int zip;
    public void setAddLine1(String addLine1 )
    {
        this.addLine1=addLine1;
    }
    public String getAddLine1()
    {
        return addLine1;
    }
    public void setAddLine2(String addLine2)
    {
        this.addLine2=addLine2;
    }
    public String getAddLine2()
    {
        return addLine2;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public String getCity()
    {
        return city;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
     public void setCountry(String country)
    {
        this.country=country;
    }
    public String getCountry()
    {
        return country;
    }
     public void setZip(int zip)
    {
        this.zip=zip;
    }
    public int getZip()
    {
        return zip;
    }
    
}
