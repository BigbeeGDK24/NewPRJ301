package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DbUtil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author truon
 */
public class UserDAO {

    public UserDAO() {

    }

    public UserDTO searchByID(String id) {
        UserDTO user = null;
        
        try{
        Connection con = DbUtil.getConnection();
        String sql = "SELECT * FROM tblUsers WHERE userID=?";
        System.out.println(sql);
        PreparedStatement check = con.prepareStatement(sql); //tao chỉ mới sẵn sàng để hỏi m chứ chưa có hỏiOK... 
                                                             //phải chuẩn bị để tránh bị hack vì ? là dữ liệu kp CL SQL
        check.setString(1, id);
        ResultSet rs = check.executeQuery();
        
        while(rs.next()){
            String userID = rs.getString("userID");
            String fullName = rs.getString("fullName");
            String password = rs.getString("password");
            String roleID = rs.getString("roleID");
            Boolean status = rs.getBoolean("status");
            user = new UserDTO(userID, fullName, password, roleID, status);} //sau khi duyệt xong thì tạo ra 1 đối tượng mới luôn
        
        }catch(Exception e){
            return null;
        }
        return user;
    }
    
    public UserDTO login(String Username , String Password){
        UserDTO user = searchByID(Username);
        if(user != null && user.getPassword().equals(Password)){
            return user;
        }
        return null;
    }
}
