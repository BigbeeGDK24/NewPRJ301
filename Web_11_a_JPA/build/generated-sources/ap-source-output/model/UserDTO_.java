package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2026-02-26T22:34:49")
@StaticMetamodel(UserDTO.class)
public class UserDTO_ { 

    public static volatile SingularAttribute<UserDTO, String> password;
    public static volatile SingularAttribute<UserDTO, String> roleID;
    public static volatile SingularAttribute<UserDTO, String> fullName;
    public static volatile SingularAttribute<UserDTO, String> userID;
    public static volatile SingularAttribute<UserDTO, Boolean> status;

}