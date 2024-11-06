/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Proveedor;
import Modelos.ProveedorDAO;
import Vistas.InterfazProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author edwin-993
 */
public class ControladorProveedor {
    InterfazProveedor vista;
    ProveedorDAO proveedorDAO;
    ControladorProveedor(InterfazProveedor vistaProveedor){
        this.vista=vistaProveedor;
        this.proveedorDAO=new ProveedorDAO();
        this.vista.addInsertarEventListener(new GuardarProveedorListener());
        this.vista.addEditarEventListener(new EditarProveedorListener());
        this.vista.addEliminarEventListener(new EliminarProveedorListener());
        this.vista.actualizarTabla(proveedorDAO.getAll());
        this.vista.setIdentificadorInsertar(String.valueOf(proveedorDAO.getMaxID()+1));
        
    }
    class GuardarProveedorListener implements ActionListener {

        @Override 
        public void actionPerformed(ActionEvent e){
            if(!vista.validarInsertar()){
                return;
            }
            Proveedor nuevo = new Proveedor();
            nuevo.setEmpresa(vista.getEmpresaInsertar());
            nuevo.setNombreContacto(vista.getNombreInsertar());
            nuevo.setDireccion(vista.getDireccionInsertar());
            
            nuevo.setTel(vista.getTelefonoInsertar());
            nuevo.setCorreo(vista.getCorreoInsertar());
            nuevo.setCoordenadas(vista.getCoordenadasInsertar());
            
            nuevo.setCiudad(vista.getCiudadInsertar());
            nuevo.setEstado(vista.getEstadoInsertar());
            
            proveedorDAO.save(nuevo);
            vista.mensajeConfirmacion("Insercion exitosa","Se ha guardado el nuevo proveedor: \n" + nuevo.toString());
            vista.actualizarTabla(proveedorDAO.getAll());
            vista.limpiarCampos();
        }
    }

    class EditarProveedorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e){
            if(!vista.validarEditar()){
                return;
            }
            Proveedor aEditar = proveedorDAO.readByID(Integer.parseInt(vista.getIdentificadorEditar()));
            if(aEditar ==null){
                vista.mensajeError("Proveedor no encontrado", "El proveedor seleccionado para la edición no pudo ser recuperado desde la base de datos...");
                return;
            }  
            aEditar.setEmpresa(vista.getEmpresaEditar());
            aEditar.setNombreContacto(vista.getNombreEditar());
            aEditar.setDireccion(vista.getDireccionEditar());
            
            aEditar.setTel(vista.getTelefonoEditar());
            aEditar.setCorreo(vista.getCorreoEditar());
            aEditar.setCoordenadas(vista.getCoordenadasEditar());
            
            aEditar.setCiudad(vista.getCiudadEditar());
            aEditar.setEstado(vista.getEstadoEditar());
            
            proveedorDAO.update(aEditar);
            
vista.mensajeConfirmacion("Actualización Exitosa", "Se ha actualizado de manera satisfactoria el proveedor " + vista.getIdentificadorEditar());

            vista.actualizarTabla(proveedorDAO.getAll());
            vista.limpiarCampos();
            vista.seleccionarAccion(0);
        }
    }

    class EliminarProveedorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            if(!vista.confirmEliminar()){
                return;
            }
            int aEliminar = Integer.parseInt(vista.getIdentificadorEliminar());
            if(aEliminar == 0){
                vista.mensajeError("Error de recuperacion de datos", "EL identificador del proveedor a eliminar no ha podido ser recuperado...\n\n El valor recuperado es: " + aEliminar);
                return;
            }
            proveedorDAO.delete(aEliminar);
            vista.mensajeConfirmacion("Eliminacion exitosa", "El proveedor con identificador " + aEliminar + " ha sido eliminado de manera exitosa");
            vista.actualizarTabla(proveedorDAO.getAll());
            vista.limpiarCampos();
        }
        
    }
}
