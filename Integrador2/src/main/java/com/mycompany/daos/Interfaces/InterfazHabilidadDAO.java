
package com.mycompany.daos.Interfaces;

import com.mycompany.entities.Habilidad;
import jakarta.persistence.EntityManager;


public interface InterfazHabilidadDAO {
    
    public void create(Habilidad habilidad);
    
    public Habilidad read(int idHabilidad);
    
    public void update(Habilidad habilidad);
    
    
    public void delete(Habilidad habilidad);
    
    
    
    
    public void setEntityManager(EntityManager em);
    
    
}
