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
public class SignupDAO implements ISignup{
 MySqLConnection mysql = new MySqLConnection();
    Connection con = mysql.getConnect();
    private PreparedStatement pre;
    private ResultSet re;
    
    
    @Override
    public void create(Signup obj) {
     try {
         pre = con.prepareStatement("insert into signup (firstname,lastname,age,username,pasword) values(?,?,?,?,?)");
         
         pre.setString(1, obj.getFirstname());
         pre.setString(2, obj.getLastname());
         pre.setString(3, obj.getAge());
         pre.setString(4, obj.getUssrname());
         pre.setString(5, obj.getPassword());
         
         pre.executeUpdate();
         
          JOptionPane.showMessageDialog(null, "Your Insertion was successfull ....");
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
    }

    @Override
    public void update(Signup obj) {
        try {
         pre = con.prepareStatement("update signup set timenout = ? where username = ?");
        pre.setString(1, obj.getFirstname());
         pre.setString(2, obj.getLastname());
         pre.setString(3, obj.getAge());
         pre.setString(4, obj.getUssrname());
         pre.setString(5, obj.getPassword());
        
         pre.executeUpdate();
         
         
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
    }
    
}
