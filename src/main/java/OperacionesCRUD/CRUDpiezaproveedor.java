
package OperacionesCRUD;

import Entidades.*;
import Util.HibernateUtil;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.*;


public class CRUDpiezaproveedor {
    
    public void save(PiezaProveedor newPiezaProveedor, int idProveedor, int idPieza){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=null;
        
        Proveedor newProveedor=session.get(Proveedor.class, idProveedor);
        Pieza newPieza=session.find(Pieza.class, idPieza);
        
        newPiezaProveedor.setProveedor(newProveedor);
        newPiezaProveedor.setPieza(newPieza);
        
        try{
        
        transaction=session.beginTransaction();
        session.persist(newPiezaProveedor);
        transaction.commit();
        }catch(Exception err){
            
            if(transaction!=null){
                transaction.rollback();
            }
        }finally{
            session.close();
        }
 
    }
    public void update(PiezaProveedor newPiezaProveedor, int idProveedor, int idPieza){
        
         Session session=HibernateUtil.getSessionFactory().openSession();
         Transaction transaction=null;
         
        

            try{
                //Relaciones
               Proveedor newProveedor=session.get(Proveedor.class, idProveedor);
               Pieza newPieza=session.find(Pieza.class, idPieza);
               newPiezaProveedor.setProveedor(newProveedor);
               newPiezaProveedor.setPieza(newPieza);
               //Merge para hacer el update
               transaction=session.beginTransaction();
               session.merge(newPiezaProveedor);
               transaction.commit();

            }catch(Exception err){
                if(transaction!=null){
                transaction.rollback();
                }
            }finally{
                 session.close();
            }
    }
    
    
    public void delete(int idPieza_proveedor){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=null;
        
        PiezaProveedor piezaProveedor=session.get(PiezaProveedor.class, idPieza_proveedor);
        
        try{
        
        transaction=session.beginTransaction();
        session.remove(piezaProveedor);
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
    
    public TableModel listToTMPProv(){
        
       Session session=HibernateUtil.getSessionFactory().openSession();
        
       List resultados=session.createQuery("from Proveedor",Proveedor.class).getResultList();
       
       Vector columnNames = new Vector();
       Vector rows = new Vector();
       
       Proveedor proveedor;
       
       columnNames.addElement("Número de Proveedor");
       columnNames.addElement("Empresa");
       columnNames.addElement("Nombre de Contacto");
       columnNames.addElement("Dirección");
       columnNames.addElement("Teléfono");
       columnNames.addElement("Correo");
       columnNames.addElement("Coordenadas");
       columnNames.addElement("Ciudad");
       columnNames.addElement("Estado");
        
       Iterator itProveedor=resultados.iterator();
       while(itProveedor.hasNext()){
           proveedor=(Proveedor)itProveedor.next();
           Vector nuevaFila=new Vector();
           nuevaFila.addElement(proveedor.getIdProveedor());
           nuevaFila.addElement(proveedor.getEmpresa());
           nuevaFila.addElement(proveedor.getNombreContacto());
           nuevaFila.addElement(proveedor.getDireccion());
           nuevaFila.addElement(proveedor.getTel());
           nuevaFila.addElement(proveedor.getCorreo());
           nuevaFila.addElement(proveedor.getCoordenadas());
           nuevaFila.addElement(proveedor.getCiudad());
           nuevaFila.addElement(proveedor.getEstado());
           rows.addElement(nuevaFila);     
       }
       return new DefaultTableModel(rows,columnNames);
    }
    
     public TableModel listToTMPPieza(){
       Session session=HibernateUtil.getSessionFactory().openSession();
        
       List resultados=session.createQuery("from Pieza",Pieza.class).getResultList();
       
       Vector columnNames = new Vector();
       Vector rows = new Vector();
       
       Pieza pieza;
       columnNames.addElement("Código de la pieza");
       columnNames.addElement("Nombre");
       columnNames.addElement("Color");
       columnNames.addElement("Material");
       columnNames.addElement("Dimensiones");
       columnNames.addElement("Descripción");
       columnNames.addElement("Categoría");
       
       Iterator itPieza=resultados.iterator();
       while(itPieza.hasNext()){
          pieza=(Pieza)itPieza.next();
          Vector nuevaFila=new Vector();
          nuevaFila.addElement(pieza.getCodigo());
          nuevaFila.addElement(pieza.getNombre());
          nuevaFila.addElement(pieza.getColor());
          nuevaFila.addElement(pieza.getMaterial());
          nuevaFila.addElement(pieza.getDimensiones());
          nuevaFila.addElement(pieza.getDescripcion());
          nuevaFila.addElement(pieza.getCategoria());
          rows.addElement(nuevaFila);     
       }
       return new DefaultTableModel(rows,columnNames);
     }
}
