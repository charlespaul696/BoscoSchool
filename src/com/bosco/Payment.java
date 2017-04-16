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
public class Payment {
    private String  id, mode,make;

    public Payment(String id, String mode, String make) {
        this.id = id;
        this.mode = mode;
        this.make = make;
    }

    public Payment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    
    
    
}
