/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="compra")
public class Compra {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idCompra")
    private int idCompra;

    @Column(name="fechaCompra")
    private Date fechaCompra;

    @Column(name="noFactura")
    private String noFactura;

    @Column(name="totalFacturado")
    private double totalFacturado;

    @Column(name="fechaFactura")
    private Date fechaFactura;

    @Column(name="IVA")
    private double IVA;

    public Compra() {}

    public Compra(int idCompra, Date fechaCompra, String noFactura, double totalFacturado, Date fechaFactura, double IVA) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.noFactura = noFactura;
        this.totalFacturado = totalFacturado;
        this.fechaFactura = fechaFactura;
        this.IVA = IVA;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(String noFactura) {
        this.noFactura = noFactura;
    }

    public double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "idCompra=" + idCompra +
                ", fechaCompra=" + fechaCompra +
                ", noFactura='" + noFactura + '\'' +
                ", totalFacturado=" + totalFacturado +
                ", fechaFactura=" + fechaFactura +
                ", IVA=" + IVA +
                '}';
    }
}