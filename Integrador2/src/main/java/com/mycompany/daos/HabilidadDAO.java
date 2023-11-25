
package com.mycompany.daos;

import com.mycompany.daos.Interfaces.InterfazHabilidadDAO;
import com.mycompany.entities.Habilidad;
import jakarta.persistence.EntityManager;


public class HabilidadDAO implements InterfazHabilidadDAO{

  
    private EntityManager em;
    

    @Override
    public void create(Habilidad habilidad) {
        em.persist(habilidad);
    }

    @Override
    public Habilidad read(int idHabilidad) {
        
        
     return em.find(Habilidad.class, new Habilidad.Builder().IdHabilidad(idHabilidad).build()); 
      
    }

    @Override
    public void update(Habilidad habilidad) {
       em.merge(habilidad); 
    }

    @Override
    public void delete(Habilidad habilidad) {
        Habilidad x=em.find(Habilidad.class, habilidad);
        x.setEstado(false);
       em.merge(x);
    }

   

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
      
    
    
}
