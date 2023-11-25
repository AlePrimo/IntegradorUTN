
package com.mycompany.daos;

import com.mycompany.daos.Interfaces.InterfazIncidenteDAO;
import com.mycompany.entities.Incidente;
import jakarta.persistence.EntityManager;


public class IncidenteDAO  implements InterfazIncidenteDAO{
    
    
     private EntityManager em;
    

    @Override
    public void create(Incidente incidente) {
        em.persist(incidente);
    }

    @Override
    public Incidente read(int idIncidente) {
        
        
     return em.find(Incidente.class, new Incidente.Builder().IdIncidente(idIncidente).build()); 
      
    }

    @Override
    public void update(Incidente incidente) {
       em.merge(incidente); 
    }

    @Override
    public void estadoRes(Incidente incidente) {
        Incidente x=em.find(Incidente.class, incidente);
        x.setResuelto(false);
       em.merge(x);
    }

   

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    } 
    
    
    
    
    
}
