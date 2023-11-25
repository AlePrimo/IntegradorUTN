
package com.mycompany.daos.Interfaces;

import com.mycompany.entities.TipoProblema;
import jakarta.persistence.EntityManager;



public interface InterfazTipoProblemaDAO {
    
    public void create(TipoProblema itipoProblema);
    
    public TipoProblema read(int idTipoProblema);
    
    public void update(TipoProblema tipoProblema);
    
    
    public void delete(TipoProblema tipoProblema);
    
   
    
    
    public void setEntityManager(EntityManager em); 
    
    
    
    
    
}
