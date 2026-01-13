/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.UserDTO;
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
            Connection conn = DbUtil.getConnection();
            String sql = "SELECT * FROM tblUsers WHERE userID='" + id + "'";
            System.out.println(sql);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String userId = rs.getString("userID");
                String fullName = rs.getString("fullName");
                String password = rs.getString("password");
                String roleId = rs.getString("roleID");
                Boolean status = rs.getBoolean("status");
                user = new UserDTO(userId, fullName, password, roleId, status);
            }
        } catch (Exception e) {
            return null;
        }
        return user;
    }

    public UserDTO login(String username, String password) {
        UserDTO user = searchByID(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }
    }
}
