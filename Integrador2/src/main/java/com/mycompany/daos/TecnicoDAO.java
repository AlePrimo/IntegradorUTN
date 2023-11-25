
package com.mycompany.daos;

import com.mycompany.daos.Interfaces.InterfazTecnicoDAO;
import com.mycompany.entities.Tecnico;
import jakarta.persistence.EntityManager;


public class TecnicoDAO implements InterfazTecnicoDAO{
    
    
    
       private EntityManager em;
    

    @Override
    public void create(Tecnico tecnico) {
        em.persist(tecnico);
    }

    @Override
    public Tecnico read(int idTecnico) {
        
        
     return em.find(Tecnico.class, new Tecnico.Builder().IdTecnico(idTecnico).build()); 
      
    }

    @Override
    public void update(Tecnico tecnico) {
       em.merge(tecnico); 
    }

    @Override
    public void delete(Tecnico tecnico) {
        Tecnico x=em.find(Tecnico.class, tecnico);
        x.setEstado(false);
       em.merge(x);
    }

   

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
    
    
    
    
}
