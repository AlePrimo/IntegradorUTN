
package com.mycompany.daos.Interfaces;

import com.mycompany.entities.ServicioContratado;
import jakarta.persistence.EntityManager;



public interface InterfazServicioContratadoDAO {
    
    public void create(ServicioContratado serviciocontratado);
    
    public ServicioContratado read(int idServicioContratado);
    
    public void update(ServicioContratado serviciocontratado);
    
    
    public void delete(ServicioContratado serviciocontratado);
    
 
    
    
    public void setEntityManager(EntityManager em); 
    
    
    
    
}
