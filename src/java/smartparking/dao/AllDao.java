/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartparking.dao;
import java.sql.*;
import javax.sql.*;
import smartparking.dbutil.*;
/**
 *
 * @author HP
 */
public class AllDao {
    
    private static PreparedStatement ps1;
    static{
        try{
            ps1=DBConnection.getConnection().prepareStatement("Select * from members where username=? and password=? and membertype=?");
        }
        catch(Exception ex){
            System.out.println("Error is in DB Comm: "+ex);
        }
    }
    
}
