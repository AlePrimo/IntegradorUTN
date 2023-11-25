
package com.mycompany.daos.Interfaces;

import com.mycompany.entities.Cliente;
import jakarta.persistence.EntityManager;



public interface InterfazClienteDAO {
    
    public void create(Cliente cliente);
    
    public Cliente read(int idCliente);
    
    public void update(Cliente cliente);
    
    
    public void delete(Cliente cliente);
    
  
    
    
    public void setEntityManager(EntityManager em);
    
    
    
    
    
}
    
    

