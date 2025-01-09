
package OperacionesCRUD;

import Entidades.Compra;
import Entidades.CompraProveedor;
import Entidades.PiezaProveedor;
import Util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CRUDcompraproveedor {
    
     public void save(CompraProveedor newCompraProveedor, int idCompra, int idPiezaProveedor){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=null;
        
        Compra newCompra=session.get(Compra.class, idCompra);
        PiezaProveedor newPiezaProveedor=session.find(PiezaProveedor.class, idPiezaProveedor);
        
        newCompraProveedor.setCompra(newCompra);
        newCompraProveedor.setPiezaProveedor(newPiezaProveedor);
        
        try{
        
        transaction=session.beginTransaction();
        session.persist(newCompraProveedor);
        transaction.commit();
        }catch(Exception err){
            
            if(transaction!=null){
                transaction.rollback();
            }
        }finally{
            session.close();
        }
         
     }
     
     public void update(CompraProveedor newCompraProveedor, int idCompra, int idPiezaProveedor){
        
         Session session=HibernateUtil.getSessionFactory().openSession();
         Transaction transaction=null;
         
            try{
                //Relaciones
               Compra newCompra=session.get(Compra.class, idCompra);
               PiezaProveedor newPiezaProveedor=session.find(PiezaProveedor.class, idPiezaProveedor);
               newCompraProveedor.setCompra(newCompra);
               newCompraProveedor.setPiezaProveedor(newPiezaProveedor);
               //Merge para hacer el update
               transaction=session.beginTransaction();
               session.merge(newCompraProveedor);
               transaction.commit();

            }catch(Exception err){
                if(transaction!=null){
                transaction.rollback();
                }
            }finally{
                 session.close();
            }
    }
     
      public void delete(int idCompraProveedor){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=null;
        
        CompraProveedor compraProveedor=session.get(CompraProveedor.class, idCompraProveedor);
        
        try{
        
        transaction=session.beginTransaction();
        session.remove(compraProveedor);
        transaction.commit();
        }catch(Exception err){
            
            if(transaction!=null){
                transaction.rollback();
            }
        }finally{
            session.close();
        }
    }
    
       public TableModel listToTMPiezaProv(){
       Session session=HibernateUtil.getSessionFactory().openSession();
        
       List resultados=session.createQuery("from PiezaProveedor",PiezaProveedor.class).getResultList();
       Vector columnNames = new Vector();
       Vector rows = new Vector();
       
       PiezaProveedor  piezaProv;
       
       columnNames.addElement("Código");
       columnNames.addElement("Precio");
       columnNames.addElement("Fecha");
       columnNames.addElement("Proveedor");
       columnNames.addElement("Código de la pieza");
       
       Iterator itPiezaProv=resultados.iterator();
       while(itPiezaProv.hasNext()){
           piezaProv=(PiezaProveedor)itPiezaProv.next();
           Vector nuevaFila=new Vector();
           nuevaFila.addElement(piezaProv.getIdPiezaProveedor());
           nuevaFila.addElement(piezaProv.getPrecio());
           nuevaFila.addElement(piezaProv.getFecha());
           nuevaFila.addElement(piezaProv.getProveedor().getIdProveedor());
           nuevaFila.addElement(piezaProv.getPieza().getCodigo());
           rows.addElement(nuevaFila);
       }
       return new DefaultTableModel(rows,columnNames);
    }
    
    public TableModel listToTMCompraProv(){
       Session session=HibernateUtil.getSessionFactory().openSession();
        
       List resultados=session.createQuery("from CompraProveedor",CompraProveedor.class).list();
       Vector columnNames = new Vector();
       Vector rows = new Vector();
       
       CompraProveedor  compraProv;
       
       columnNames.addElement("Número del registro");
       columnNames.addElement("Cantidad");
       columnNames.addElement("Subtotal");
       columnNames.addElement("Pieza Proveedor");
       columnNames.addElement("Compra");
       
       Iterator itCompraProv=resultados.iterator();
       while(itCompraProv.hasNext()){
           compraProv=(CompraProveedor)itCompraProv.next();
           Vector nuevaFila=new Vector();
           nuevaFila.addElement(compraProv.getIdCompraProveedor());
           nuevaFila.addElement(compraProv.getCantidad());
           nuevaFila.addElement(compraProv.getSubtotal());
           nuevaFila.addElement(compraProv.getPiezaProveedor().getIdPiezaProveedor());
           nuevaFila.addElement(compraProv.getCompra().getIdCompra());
           rows.addElement(nuevaFila);
       }
       return new DefaultTableModel(rows,columnNames);
    }
    
     public TableModel listToTMCompra(){
       Session session=HibernateUtil.getSessionFactory().openSession();
        
       List resultados=session.createQuery("from Compra",Compra.class).getResultList();
       Vector columnNames = new Vector();
       Vector rows = new Vector();
       
       Compra  compra;
       
       columnNames.addElement("Número de compra");
       columnNames.addElement("Fecha de compra");
       columnNames.addElement("Número de Factura");
       columnNames.addElement("Total facturado");
       columnNames.addElement("Fecha Factura");
       columnNames.addElement("IVA");
       
       Iterator itCompra=resultados.iterator();
       while(itCompra.hasNext()){
           compra=(Compra)itCompra.next();
           Vector nuevaFila=new Vector();
           nuevaFila.addElement(compra.getIdCompra());
           nuevaFila.addElement(compra.getFechaCompra());
           nuevaFila.addElement(compra.getNoFactura());
           nuevaFila.addElement(compra.getTotalFacturado());
           nuevaFila.addElement(compra.getFechaFactura());
           nuevaFila.addElement(compra.getIVA());
           rows.addElement(nuevaFila);
       }
       return new DefaultTableModel(rows,columnNames);
    }
}
