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


public class PaymentDAO implements IPayment{
    MySqLConnection mysql = new MySqLConnection();
    Connection con = mysql.getConnect();
    private PreparedStatement pre;
    private ResultSet re;
    
    @Override
    public void create(Payment obj) {
        try {
            pre = con.prepareStatement("insert into payment values(?,?,?)");
            pre.setString(1, obj.getId());
            pre.setString(2, obj.getMode());
            pre.setString(3, obj.getMake());
           
            
            pre.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Your Insertion was successfull ....");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void update(Payment obj) {
         try {
            pre = con.prepareStatement("update  payment set modeOfPayment = ?, set makePayment = ? where id = ?");
            pre.setString(3, obj.getId());
            pre.setString(1, obj.getMode());
            pre.setString(2, obj.getMake());
            
            
            pre.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
