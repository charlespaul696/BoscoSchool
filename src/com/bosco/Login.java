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
public class Login {
    private String ussrname,password,timein,timeoiut;

    public Login(String ussrname, String password, String timein, String timeoiut) {
        this.ussrname = ussrname;
        this.password = password;
        this.timein = timein;
        this.timeoiut = timeoiut;
    }
    

    public Login() {
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

    public String getTimein() {
        return timein;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public String getTimeoiut() {
        return timeoiut;
    }

    public void setTimeoiut(String timeoiut) {
        this.timeoiut = timeoiut;
    }

    
    
}