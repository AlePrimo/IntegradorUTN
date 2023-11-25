

package com.mycompany.integrador2;


import com.mycompany.daos.ClienteDAO;
import com.mycompany.entities.Cliente;
import com.mycompany.entities.Especialidad;
import com.mycompany.entities.Habilidad;
import com.mycompany.entities.Incidente;
import com.mycompany.entities.ServicioContratado;
import com.mycompany.entities.Tecnico;
import com.mycompany.entities.TipoProblema;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;
import java.time.Month;






public class Integrador2 {
    
    
    public static EntityManager getEntityManager(){
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("integrador2PU");
    EntityManager m= emf.createEntityManager();
    return m;
    }

    public static void main(String[] args) {
        
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
//            Cliente c1 = new Cliente.Builder()
//                    .Cuit(321445298)
//                    .RazonSocial("Pelucas Perez")
//                    .Nombre("Juan Carlos")
//                    .Apellido("Parna")
//                    .Telefono("152223689")
//                    .Email("parna@hotmail.com")
//                    .Estado(true)
//                    .build();
//
//
//            em.persist(c1);
//            Tecnico tec=new Tecnico.Builder()
//                    .Apellido("Lopez")
//                    .Nombre("Cocho")
//                    .NroLegajo(1221456)
//                    .Telefono("114578964")
//                    .Estado(true)
//                    .Disponible(true)
//                    .Email("cocho@gmail.com")
//                    .build();
//            em.persist(tec);
//            TipoProblema tp=new TipoProblema.Builder()
//                    .Especial(Especialidad.LINUX)
//                    .DetalleProblema("No anda linux")
//                    .TiempoEstimado(2)
//                    .TiempoMaximo(3)
//                    .build();
//            em.persist(tp);
//            
//            Habilidad hb=new Habilidad.Builder()
//                    .Especial(Especialidad.WINDOWS)
//                    .Estado(true)
//                    .Tecnico(tec)
//                    .build();
//            em.persist(hb);
//            
//            ServicioContratado sc =new ServicioContratado.Builder()
//                    .Especial(Especialidad.LINUX)
//                    .Cliente(c1)
//                    .Estado(true)
//                    .build();
//            
//            em.persist(sc);
//                    
//            Incidente asunto=new Incidente.Builder()
//                    .Descripcion("LLamaron de Pelucas Perez, por problemas con linux, se envio a Cocho Lopez")
//                    .Cliente(c1)
//                    .Tecnico(tec)
//                    .Tipo(tp)
//                    .FechaResolucion(LocalDate.of(2023, Month.MARCH, 5))
//                    .Consideraciones("Se soluciono el problema sin novedades")
//                    .Resuelto(true)
//                    .build();
//            
//            em.persist(asunto);
//            
//       

//ClienteDAO cd=new ClienteDAO();
//cd.setEntityManager(em);
//Cliente c2=new Cliente.Builder()
//        .Nombre("Claudio")
//        .Apellido("Garcia")
//        .Email("garcia@gmail.com")
//        .RazonSocial("Taller Garcia")
//.Estado(true)
//        .Telefono("114528963")
//        .Cuit(12452873).build();

            //cd.create(c2);
       




            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        

          

    }
}
