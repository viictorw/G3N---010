/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Persistence;

/**
 *
 * @author viict
 */
public class PersistenceUtil {
    
    private static EntityManagerFactory emf = null;
    
    private PersistenceUtil()   {
    }
    
    public static EntityManager getEntityManager(){
        
        if(emf == null)
            emf = Persistence.createEntityManagerFactory("exemploJPAPU");
        return emf.creatEntityManager();
    }
    
    public static void close (EntityManager em){
        if(em != null)
            em.close();
    }
}
