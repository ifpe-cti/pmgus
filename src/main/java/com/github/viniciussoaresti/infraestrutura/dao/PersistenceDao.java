/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author Vinícius Soares
 */
public class PersistenceDao {
    
    private static PersistenceDao instance = null;
    private EntityManagerFactory emf = null;
    
    private PersistenceDao(){
    
        this.emf = Persistence.createEntityManagerFactory("syspmPU");
    
    }
    
    public static PersistenceDao getInstance(){
        if(instance==null)
            instance = new PersistenceDao();
        return instance;
    }
    
    public void persist(Object o){
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(o);
        
        em.getTransaction().commit();
        em.close();
    }
    
    public void update(Object o){
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.merge(o);
        
        em.getTransaction().commit();
        em.close();
    }
    
    public List read(String sql){
        EntityManager em = emf.createEntityManager();
        
        List result = em.createQuery(sql).getResultList();
        
        em.close();
        
        return result;
    }
    
    
    public void delete(Object o){
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        if (!em.contains(o)) {
            o = em.merge(o);
        }
        em.remove(o);

        
        em.getTransaction().commit();
        em.close();
    }
}

