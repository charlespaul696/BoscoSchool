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
public class Courses {
    private String  id, name,department;

    public Courses(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Courses() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String name) {
        this.name = department;
    }

    
}
