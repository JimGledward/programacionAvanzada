/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import beans.Entrega;
import controladores.EntregaController;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JGLEDWARD
 */
@WebService(serviceName = "CrearEntregaUsuario")
public class CrearEntregaUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearEntrega")
    public MensajeSalida crearEntrega(@WebParam(name = "idCliente") String idCliente, @WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "tipoServicio") String tipoServicio) {
        Entrega datosEntrega = new Entrega(idCliente, nombres, apellidos, direccion, telefono, tipoServicio);
        EntregaController controller = new EntregaController();
        return controller.crearEntrega(datosEntrega);
    }
}
