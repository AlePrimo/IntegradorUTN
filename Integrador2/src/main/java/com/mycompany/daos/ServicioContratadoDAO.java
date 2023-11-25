
package com.mycompany.daos;

import com.mycompany.daos.Interfaces.InterfazServicioContratadoDAO;
import com.mycompany.entities.ServicioContratado;
import jakarta.persistence.EntityManager;


public class ServicioContratadoDAO implements InterfazServicioContratadoDAO{
    
       private EntityManager em;
    

    @Override
    public void create(ServicioContratado serviciocontratado) {
        em.persist(serviciocontratado);
    }

    @Override
    public ServicioContratado read(int idServicioContratado) {
        
        
     return em.find(ServicioContratado.class, new ServicioContratado.Builder().IdServicio(idServicioContratado).build()); 
      
    }

    @Override
    public void update(ServicioContratado serviciocontratado) {
       em.merge(serviciocontratado); 
    }

    @Override
    public void delete(ServicioContratado serviciocontratado) {
        ServicioContratado x=em.find(ServicioContratado.class, serviciocontratado);
        x.setEstado(false);
       em.merge(x);
    }

   

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
    
    
    
    
}
