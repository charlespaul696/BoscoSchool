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
public class CAs_RecordsDAO implements ICAs_Records{
 MySqLConnection mysql = new MySqLConnection();
    Connection con = mysql.getConnect();
    private PreparedStatement pre;
    private ResultSet re;
    
    
    @Override
    public void create(CAs_Records obj) {
     try {
         pre = con.prepareStatement("insert into cas_record values(?,?,?,?,?)");
         pre.setString(1, obj.getStudent());
         pre.setString(2, obj.getTerm());
         pre.setInt(3, obj.getCAs1());
         pre.setInt(4, obj.getCAs2());
         pre.setInt(5, obj.getCAs3());
         
         pre.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "Your Insertion was successfull ....");
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
    }

    @Override
    public void update(CAs_Records obj) {
        try {
         pre = con.prepareStatement("update cas_record set student_id = ?, set term_session_id = ?, set CAS1 = ?, set CAS2 = ?, set CAS3 = ? where student_id = ?");
         pre.setString(5, obj.getStudent());
         pre.setString(1, obj.getTerm());
         pre.setInt(2, obj.getCAs1());
         pre.setInt(3, obj.getCAs2());
         pre.setInt(4, obj.getCAs3());
         
         pre.executeUpdate();
         
         
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
    }
    
}
