/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import jakarta.persistence.*;

/**
 *
 * @author edwin-993
 */

@Entity
@Table(name = "Proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProveedor", nullable = false)
    private Integer idProveedor;

    @Column(name = "empresa", nullable = false, length = 100)
    private String empresa;

    @Column(name = "nombre_contacto", length = 100)
    private String nombreContacto;

    @Column(name = "direccion", length = 255)
    private String direccion;

    @Column(name = "tel", length = 20)
    private String tel;

    @Column(name = "correo", length = 100)
    private String correo;

    @Column(name = "coordenadas", length = 100)
    private String coordenadas;

    @Column(name = "ciudad", length = 100)
    private String ciudad;

    @Column(name = "estado", length = 100)
    private String estado;

    // Getters y Setters

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // toString para facilitar la visualización de los datos
    @Override
    public String toString() {
    return "Proveedor:\n" +
            "  ID: " + idProveedor + "\n" +
            "  Empresa: " + empresa + "\n" +
            "  Nombre de Contacto: " + nombreContacto + "\n" +
            "  Dirección: " + direccion + "\n" +
            "  Teléfono: " + tel + "\n" +
            "  Correo: " + correo + "\n" +
            "  Coordenadas: " + coordenadas + "\n" +
            "  Ciudad: " + ciudad + "\n" +
            "  Estado: " + estado + "\n";
}


}

