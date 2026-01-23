package model;


public class UserDTO {

    private String userID;
    private String fullName;
    private String password;
    private String roleID;
    private boolean status;

    

    public UserDTO(String userID, String fullName, String password, String roleID, boolean status) {
        this.userID = userID;
        this.fullName = fullName;
        this.password = password;
        this.roleID = roleID;
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String getRoleID() {
        return roleID;
    }

    public boolean getStatus() {
        return status;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
