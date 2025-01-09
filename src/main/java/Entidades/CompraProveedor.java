
package Entidades;

import jakarta.persistence.*;

@Entity
@Table(name="CompraProveedor")
public class CompraProveedor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idCompraProveedor")
    private int idCompraProveedor;
    
    @Column(name="cantidad")
    private int cantidad;
    
    @Column(name="subtotal")
    private double subtotal;
    
    @ManyToOne
    @JoinColumn(name="idPiezaProveedor", foreignKey=@ForeignKey(name="idPiezaProveedor"))
    private PiezaProveedor piezaProveedor;
    
    @ManyToOne
    @JoinColumn(name="idCompra", foreignKey=@ForeignKey(name="idCompra"))
    private Compra compra;

    public CompraProveedor(int idCompraProveedor, int cantidad, double subtotal, PiezaProveedor piezaProveedor, Compra compra) {
        this.idCompraProveedor = idCompraProveedor;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.piezaProveedor = piezaProveedor;
        this.compra = compra;
    }

    
    public CompraProveedor(){}

    public void setIdCompraProveedor(int idCompraProveedor) {
        this.idCompraProveedor = idCompraProveedor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setPiezaProveedor(PiezaProveedor piezaProveedor) {
        this.piezaProveedor = piezaProveedor;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public int getIdCompraProveedor() {
        return idCompraProveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public PiezaProveedor getPiezaProveedor() {
        return piezaProveedor;
    }

    public Compra getCompra() {
        return compra;
    }
    
    @Override
    public String toString() {
        return "CompraProveedor{" +
                "ID='" + idCompraProveedor + '\'' +
                ", Cantidad='" +cantidad + '\'' +
                ", Subtotal='" + subtotal + '\'' +
                ", Pieza proovedor='" + piezaProveedor + '\'' +
                ", Compra='" + compra+ '\'';
    }
    
    
    
}
