
package com.mycompany.daos;

import com.mycompany.daos.Interfaces.InterfazClienteDAO;
import com.mycompany.entities.Cliente;
import jakarta.persistence.EntityManager;



public class ClienteDAO implements InterfazClienteDAO{
    
    
    private EntityManager em;
    

    @Override
    public void create(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public Cliente read(int idCliente) {
        
        
     return em.find(Cliente.class, new Cliente.Builder().IdCliente(idCliente).build()); 
      
    }

    @Override
    public void update(Cliente cliente) {
       em.merge(cliente); 
    }

    @Override
    public void delete(Cliente cliente) {
        Cliente x=em.find(Cliente.class, cliente);
        x.setEstado(false);
       em.merge(x);
    }

   

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
}
