package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DbUtil;

public class UniversityDAO {

    public UniversityDAO() {

    }
    
    public ArrayList<UniversityDTO> searchByColumn(String column, String value) {
        ArrayList<UniversityDTO> students = new ArrayList<>();
        try {
            Connection con = DbUtil.getConnection();
            String sql = "SELECT * FROM tblUniversity WHERE " + column + "=?";

            PreparedStatement letter = con.prepareStatement(sql);
            letter.setString(1, value);
            ResultSet rs = letter.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String shortName = rs.getString("shortName");
                String description = rs.getString("description");
                int foundedYear = rs.getInt("foundedYear");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String region = rs.getString("region");
                String type = rs.getString("type");
                int totalStudents = rs.getInt("totalStudents");
                int totalFaculties = rs.getInt("totalFaculties");
                boolean isDraft = rs.getBoolean("isDraft");

                UniversityDTO u = new UniversityDTO(id, name, shortName, description, foundedYear, address, city, region, type, totalStudents, totalFaculties, isDraft);
                students.add(u);
            }
        } catch (Exception e) {
            return null;
        }
        return students;
    }
    
    

    public ArrayList<UniversityDTO> filterByColumn(String column, String value) {
        ArrayList<UniversityDTO> students = new ArrayList<>();
        try {
            Connection con = DbUtil.getConnection();
             String sql = "SELECT * FROM tblUniversity WHERE " + column + " LIKE ?";
            
            PreparedStatement letter = con.prepareStatement(sql);
            letter.setString(1, "%" + value + "%");
            System.out.println(letter.toString());
            ResultSet rs = letter.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String shortName = rs.getString("shortName");
                String description = rs.getString("description");
                int foundedYear = rs.getInt("foundedYear");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String region = rs.getString("region");
                String type = rs.getString("type");
                int totalStudents = rs.getInt("totalStudents");
                int totalFaculties = rs.getInt("totalFaculties");
                boolean isDraft = rs.getBoolean("isDraft");

                UniversityDTO u = new UniversityDTO(id, name, shortName, description, foundedYear, address, city, region, type, totalStudents, totalFaculties, isDraft);
                students.add(u);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return students;
    }
    
    public ArrayList<UniversityDTO> seachById(String id){
        return searchByColumn("id", id);
    }
    
    public ArrayList<UniversityDTO> searchbyName(String name){
        return searchByColumn("name", name);
    }
    
    public ArrayList<UniversityDTO> filterByName(String name){
        return filterByColumn("name", name);
    }
}
