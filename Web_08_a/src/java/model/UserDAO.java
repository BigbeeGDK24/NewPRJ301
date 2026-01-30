/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DbUtil;

/**
 *
 * @author truon
 */
public class UserDAO {

    public UserDAO() {

    }

    public UserDTO searchByID(String id) {

        UserDTO user = null;
        try {

            Connection con = DbUtil.getConnection();
            String sql = "SELECT * FROM tblUsers WHERE userID=?";
            System.out.println(sql);

            PreparedStatement letter = con.prepareStatement(sql);
            letter.setString(1, id);
            ResultSet rs = letter.executeQuery();

            while (rs.next()) {
                String userID = rs.getString("userID");
                String fullName = rs.getString("fullName");
                String password = rs.getString("password");
                String roleID = rs.getString("roleID");
                boolean status = rs.getBoolean("status");

                user = new UserDTO(userID, fullName, password, roleID, status);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
    
    public UserDTO Login(String username , String password){
        UserDTO user = searchByID(username);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        else{
            return null;
        }
    }
}
