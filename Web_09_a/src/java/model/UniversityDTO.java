/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author truon
 */
public class UniversityDTO {

    private String id, name, shortName, description;
    private int foundedYear;
    private String address, city, region, type;
    private int totalStudents, totalFaculties;
    private boolean isDraft;

    public UniversityDTO(String id, String name, String shortName, String description, int foundedYear, String address, String city, String region, String type, int totalStudents, int totalFaculties, boolean isDraft) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.foundedYear = foundedYear;
        this.address = address;
        this.city = city;
        this.region = region;
        this.type = type;
        this.totalStudents = totalStudents;
        this.totalFaculties = totalFaculties;
        this.isDraft = isDraft;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getDescription() {
        return description;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getType() {
        return type;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public int getTotalFaculties() {
        return totalFaculties;
    }

    public boolean isIsDraft() {
        return isDraft;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public void setTotalFaculties(int totalFaculties) {
        this.totalFaculties = totalFaculties;
    }

    public void setIsDraft(boolean isDraft) {
        this.isDraft = isDraft;
    }
}
