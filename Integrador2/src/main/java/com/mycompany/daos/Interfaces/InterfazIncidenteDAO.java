

package com.mycompany.daos.Interfaces;

import com.mycompany.entities.Incidente;
import jakarta.persistence.EntityManager;



public interface InterfazIncidenteDAO {
    
   public void create(Incidente incidente);
    
    public Incidente read(int idIncidente);
    
    public void update(Incidente incidente);
    
    
    public void estadoRes(Incidente incidente);
    
  
    
    
    public void setEntityManager(EntityManager em); 
    
    
}
