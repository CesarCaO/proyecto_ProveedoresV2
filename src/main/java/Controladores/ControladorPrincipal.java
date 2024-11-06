/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.InterfazPrincipal;
import Vistas.InterfazProveedor;

/**
 *
 * @author edwin-993
 */
public class ControladorPrincipal {
    private InterfazPrincipal interfazPrincipal;
    public ControladorPrincipal(InterfazPrincipal interfazPrincipal){
        this.interfazPrincipal = interfazPrincipal;
        this.interfazPrincipal.addProveedorEventListener(e-> abrirProveedor());
    }
    public void abrirProveedor(){
        InterfazProveedor vistaProveedor = new InterfazProveedor();
        new ControladorProveedor(vistaProveedor);
        this.interfazPrincipal.setVisible(false);
        vistaProveedor.setVisible(true);
    }
}
