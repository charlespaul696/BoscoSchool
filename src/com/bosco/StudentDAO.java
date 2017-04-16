/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bosco;

import connect.MySqLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author charles
 */


public class StudentDAO implements IStudent{
    MySqLConnection mysql = new MySqLConnection();
    Connection con = mysql.getConnect();
    private PreparedStatement pre;
    private ResultSet re;
    
    @Override
    public void create(Student obj) {
        try {
            pre = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
            pre.setString(1, obj.getId());
            pre.setString(2, obj.getFirstname());
            pre.setString(3, obj.getLastname());
            pre.setString(4, obj.getGender());
            pre.setString(5, obj.getDateofbirth());
            pre.setString(6, obj.getState());
            pre.setString(7, obj.getDepartment());
            
            pre.executeUpdate();
             JOptionPane.showMessageDialog(null, "Your Insertion was successfull ....");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void update(Student obj) {
         try {
            pre = con.prepareStatement("update  student set firstname = ?, set lastname = ?, set gender = ?, set dob = ?, set state = ?, department_id = ? where id = ? or firstname = ?");
            pre.setString(7, obj.getId());
            pre.setString(8, obj.getFirstname());
            pre.setString(1, obj.getFirstname());
            pre.setString(2, obj.getLastname());
            pre.setString(3, obj.getGender());
            pre.setString(4, obj.getDateofbirth());
            pre.setString(5, obj.getState());
            pre.setString(6, obj.getDepartment());
            
            pre.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
