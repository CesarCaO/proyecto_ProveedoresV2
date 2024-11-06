/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Controladores.ControladorPrincipal;
import Vistas.InterfazPrincipal;

/**
 *
 * @author edwin-993
 */
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            System.out.println("Iniciando la aplicación...");
            InterfazPrincipal interfazPrincipal = new InterfazPrincipal();
            ControladorPrincipal controladorPrincipal = new ControladorPrincipal(interfazPrincipal);
            interfazPrincipal.setVisible(true);
        }
        );
    }
}
