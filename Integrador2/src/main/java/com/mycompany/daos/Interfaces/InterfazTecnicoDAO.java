
package com.mycompany.daos.Interfaces;

import com.mycompany.entities.Tecnico;
import jakarta.persistence.EntityManager;



public interface InterfazTecnicoDAO {
    
     public void create(Tecnico tecnico);
    
    public Tecnico read(int idTecnico);
    
    public void update(Tecnico tecnico);
    
    
    public void delete(Tecnico tecnico);
    
   
    
    
    public void setEntityManager(EntityManager em);
    
}
