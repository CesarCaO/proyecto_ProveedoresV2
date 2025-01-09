/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Pieza")
public class Pieza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo;

    @Column(name="nombre")
    private String nombre;

    @Column(name="color")
    private String color;

    @Column(name="material")
    private String material;

    @Column(name="dimensiones")
    private String dimensiones;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="categoria")
    private String categoria;

    public Pieza() {}

    public Pieza(int codigo, String nombre, String color, String material, String dimensiones, String descripcion, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.material = material;
        this.dimensiones = dimensiones;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}