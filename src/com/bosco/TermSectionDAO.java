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


public class TermSectionDAO implements ITermSection{
    MySqLConnection mysql = new MySqLConnection();
    Connection con = mysql.getConnect();
    private PreparedStatement pre;
    private ResultSet re;
    
    @Override
    public void create(TermSection obj) {
        try {
            pre = con.prepareStatement("insert into term_session values(?)");
           // pre.setString(1, obj.getId());
            pre.setString(1, obj.getName());
            
            pre.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Your Insertion was successfull ....");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void update(TermSection obj) {
         try {
            pre = con.prepareStatement("update  term_session set name = ? where id = ?");
            pre.setString(2, obj.getId());
            pre.setString(1, obj.getName());
            
            pre.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
