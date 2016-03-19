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
public class Person {
    private String name;
    private Address address;
    private String mobile;
    private String home;
    private String work;
    
    public void setName(String name) {
        this.name = name;
        
    }

    public void setAddress(Address address) {
        this.address = address;

    }

    public void setMobile(String mobile) {
        this.mobile = mobile;

    }

    public void setHome(String home) {
        this.home = home;

    }

    public void setWork(String work) {
        this.work = work;

    }

    public String getname() {
        return name;

    }

    public Address getAddress() {
        return address;

    }

    public String getMobile() {
        return mobile;

    }

    public String getHome() {
        return home;

    }

    public String getWork() {
        return work;

    }

    
    
}
