package controladores;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import jpa.entities.NextEntregas;
import services.MensajeSalida;

/**
 *
 * @author JGLEDWARD
 */
public class EntregaController {

    //Hace la insercción en la tabla de entregas. 
    public MensajeSalida crearEntrega(beans.Entrega datosEntrega)  {
        MensajeSalida salida = new MensajeSalida();
        try {
            EntityController ec = new EntityController();
            EntityManager entityManager = ec.getEntityManager();
            entityManager.getTransaction().begin();
            long id = System.currentTimeMillis();
            NextEntregas entrega = new NextEntregas();
            entrega.setApellidosCliente(datosEntrega.getApellidos().toUpperCase());
            entrega.setDireccion(datosEntrega.getDireccion().toUpperCase());
            entrega.setFecha(new java.util.Date(id));
            entrega.setIdCliente(new Integer(datosEntrega.getId_cliente()));
            entrega.setIdEntrega(id);
            entrega.setNombresCliente(datosEntrega.getNombres().toUpperCase());
            entrega.setTelefono(datosEntrega.getTelefono().toUpperCase());
            entrega.setTipoServicio(datosEntrega.getTipoServicio().toUpperCase());
            entityManager.persist(entrega);
            entityManager.getTransaction().commit();
            entityManager.close();
            salida.setIdEntrega(id+"");
            salida.setMensaje("OK");
            return salida;
        } catch (Exception e) {
            salida.setIdEntrega(null);
            salida.setMensaje(("ERROR: " + e.getMessage()));
            return salida;
        }
    }
}
