
package Entidades;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="PiezaProveedor")
public class PiezaProveedor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idPiezaProveedor")
    private int idPiezaProveedor;
    
    @Column(name="precio")
    private double precio;
    
    @Column(name="fecha")
    private Date fecha;
    
    
    @ManyToOne
    @JoinColumn(name="idProveedor", foreignKey=@ForeignKey(name="idProveedor"))
    private Proveedor proveedor;
    
    @ManyToOne
    @JoinColumn(name="codigo",foreignKey=@ForeignKey(name="codigo"))
    private Pieza pieza;
    
   @OneToMany(mappedBy="piezaProveedor",cascade = CascadeType.ALL, orphanRemoval = true)
   private List<CompraProveedor> comprasProv = new ArrayList<>();

    public PiezaProveedor(int idPiezaProveedor, double precio, Date fecha, Proveedor proveedor, Pieza pieza) {
        this.idPiezaProveedor = idPiezaProveedor;
        this.precio = precio;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.pieza = pieza;
    }

   

    
    public PiezaProveedor(){}

    public void setIdPiezaProveedor(int idPiezaProveedor) {
        this.idPiezaProveedor = idPiezaProveedor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public void setComprasProv(List<CompraProveedor> comprasProv) {
        this.comprasProv = comprasProv;
    }

    public int getIdPiezaProveedor() {
        return idPiezaProveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public List<CompraProveedor> getComprasProv() {
        return comprasProv;
    }

    
    
    @Override
    public String toString(){
        return "Pieza Proveedor\n"+
                "ID:"+idPiezaProveedor+"\n"+
                "Precio:"+precio+"\n"+
                "Fecha:"+fecha+"\n"+
                "Proveedor:"+proveedor.getIdProveedor()+"\n"+
                "Pieza:"+pieza+"\n";
    }
    

    
    
}
