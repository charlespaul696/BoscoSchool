/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bosco;

/**
 *
 * @author charles
 */
public class Signup {
    private String ussrname,password,age,firstname,lastname;

    public Signup(String ussrname, String password, String age, String firstname, String lastname) {
        this.ussrname = ussrname;
        this.password = password;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

  

    public Signup() {
    }

    public String getUssrname() {
        return ussrname;
    }

    public void setUssrname(String ussrname) {
        this.ussrname = ussrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

   
    
}