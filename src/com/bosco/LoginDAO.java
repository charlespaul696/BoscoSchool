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
public class LoginDAO implements Ilogin{
 MySqLConnection mysql = new MySqLConnection();
    Connection con = mysql.getConnect();
    private PreparedStatement pre;
    private ResultSet re;
    
    
    @Override
    public void create(Login obj) {
     try {
         pre = con.prepareStatement("insert into login (signup_username,signup_pasword,timein,timenout)values(?,?,?,?)");
         pre.setString(1, obj.getUssrname());
         pre.setString(2, obj.getPassword());
         pre.setString(3, obj.getTimein());
         pre.setString(4, obj.getTimeoiut());
         
         pre.executeUpdate();
         
          JOptionPane.showMessageDialog(null, "Your Insertion was successfull ....");
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
    }

    @Override
    public void update(Login obj) {
        try {
         pre = con.prepareStatement("insert into login  timenout values(?) where signup_username = ?");
        // pre.setString(5, obj.getPassword());
         pre.setString(2, obj.getUssrname());
//         pre.setString(1, obj.getPassword());
//         pre.setString(2, obj.getTimein());
         pre.setString(1, obj.getTimeoiut());
        
         pre.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "Thanks for using this app..");
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
    }
    
}
