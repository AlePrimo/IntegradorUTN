
package com.mycompany.daos;

import com.mycompany.daos.Interfaces.InterfazTipoProblemaDAO;
import com.mycompany.entities.TipoProblema;
import jakarta.persistence.EntityManager;


public class TipoProblemaDAO implements InterfazTipoProblemaDAO  {
    
       private EntityManager em;
    

    @Override
    public void create(TipoProblema tipoproblema) {
        em.persist(tipoproblema);
    }

    @Override
    public TipoProblema read(int idTipoProblema) {
        
        
     return em.find(TipoProblema.class, new TipoProblema.Builder().IdTipoProblema(idTipoProblema).build()); 
      
    }

    @Override
    public void update(TipoProblema tipoproblema) {
       em.merge(tipoproblema); 
    }

    @Override
    public void delete(TipoProblema tipoproblema) {
      TipoProblema x= em.merge(tipoproblema);
      em.remove(x);
    }

   

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
    
    
}
