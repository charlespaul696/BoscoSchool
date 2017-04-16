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
public class CAs_Records {
    private String student,term;
    private int CAs1,CAs2,CAs3;

    public CAs_Records(String student, String term, int CAs1, int CAs2, int CAs3) {
        this.student = student;
        this.term = term;
        this.CAs1 = CAs1;
        this.CAs2 = CAs2;
        this.CAs3 = CAs3;
    }

    public CAs_Records() {
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getCAs1() {
        return CAs1;
    }

    public void setCAs1(int CAs1) {
        this.CAs1 = CAs1;
    }

    public int getCAs2() {
        return CAs2;
    }

    public void setCAs2(int CAs2) {
        this.CAs2 = CAs2;
    }

    public int getCAs3() {
        return CAs3;
    }

    public void setCAs3(int CAs3) {
        this.CAs3 = CAs3;
    }
 
    
    
}