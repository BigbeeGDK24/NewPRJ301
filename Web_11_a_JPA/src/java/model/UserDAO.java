/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import utils.DbUtils;
import utils.JPAUtil;


public class UserDAO {

    public UserDAO() {
    }

    public UserDTO searchById(String username) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return  em.find(UserDTO.class, username);
        } finally {
            em.close();
        }
    }

    public UserDTO login(String username, String password) {
        UserDTO u = searchById(username);
        if (u != null && u.getPassword().equals(password)) {
            return u;
        }
        return null;
    }
    
    public boolean add(UserDTO u){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        try {
            tx.begin();
            
            //Add
            em.persist(u);
            
            tx.commit();
            return true;
        } catch (Exception e) {
            tx.rollback();
            return false;
        }finally{
            em.close();
        }
    }
    
    public boolean update(UserDTO u){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        try {
            tx.begin();
            
            //Update
            em.merge(u);
            
            tx.commit();
            return true;
        } catch (Exception e) {
            tx.rollback();
            return false;
        }finally{
            em.close();
        }
    }

}
