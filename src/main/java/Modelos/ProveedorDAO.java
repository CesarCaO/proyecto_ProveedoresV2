/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ProveedorDAO {

    // Método para guardar un nuevo proveedor
    public void save(Proveedor proveedor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            System.out.println("Sesión de Hibernate obtenida, iniciando transacción...");
            transaction = session.beginTransaction();

            System.out.println("Guardando el proveedor en la base de datos...");
            session.persist(proveedor);

            transaction.commit();
            System.out.println("¡Proveedor guardado exitosamente!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                System.err.println("Error al guardar el proveedor, realizando rollback.");
            }
        } finally {
            session.close();
            System.out.println("Sesión de Hibernate cerrada.");
        }
    }

    // Método para leer (consultar) un proveedor por su ID
    public Proveedor readByID(int idProveedor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Proveedor proveedor = null;

        try {
            System.out.println("Sesión de Hibernate obtenida, iniciando consulta...");
            proveedor = session.get(Proveedor.class, idProveedor);
            System.out.println("Proveedor encontrado: " + proveedor);
        } catch (Exception e) {
            System.err.println("Error al leer el proveedor.");
        } finally {
            session.close();
            System.out.println("Sesión de Hibernate cerrada.");
        }

        return proveedor;
    }

    // Método para actualizar un proveedor existente
    public void update(Proveedor proveedor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            System.out.println("Sesión de Hibernate obtenida, iniciando transacción...");
            transaction = session.beginTransaction();

            System.out.println("Actualizando el proveedor en la base de datos...");
            session.merge(proveedor); // merge para actualizar el proveedor existente

            transaction.commit();
            System.out.println("¡Proveedor actualizado exitosamente!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                System.err.println("Error al actualizar el proveedor, realizando rollback.");
            }
        } finally {
            session.close();
            System.out.println("Sesión de Hibernate cerrada.");
        }
    }

    // Método para eliminar un proveedor por su ID
    public void delete(int idProveedor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            System.out.println("Sesión de Hibernate obtenida, iniciando transacción...");
            transaction = session.beginTransaction();

            Proveedor proveedor = session.get(Proveedor.class, idProveedor);
            if (proveedor != null) {
                System.out.println("Eliminando el proveedor de la base de datos...");
                session.remove(proveedor);

                transaction.commit();
                System.out.println("¡Proveedor eliminado exitosamente!");
            } else {
                System.out.println("Proveedor con ID " + idProveedor + " no encontrado.");
                if (transaction != null) {
                    transaction.rollback();
                }
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                System.err.println("Error al eliminar el proveedor, realizando rollback.");
            }
        } finally {
            session.close();
            System.out.println("Sesión de Hibernate cerrada.");
        }
    }

    // Método para obtener todos los proveedores
    public List<Proveedor> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Proveedor> proveedores = null;

        try {
            System.out.println("Sesión de Hibernate obtenida, obteniendo todos los proveedores...");
            proveedores = session.createQuery("from Proveedor", Proveedor.class).list();
            System.out.println("Proveedores obtenidos: " + proveedores.size());
        } catch (Exception e) {
            System.err.println("Error al obtener la lista de proveedores.");
        } finally {
            session.close();
            System.out.println("Sesión de Hibernate cerrada.");
        }

        return proveedores;
    }
    public int getMaxID(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Integer idMax = -1;
        try{
            System.out.println("Sesion de Hibernate obtenida, recuperando el ID mas alto de los proveedores");
            idMax = session.createQuery("select max(p.idProveedor) from Proveedor p", Integer.class).uniqueResult();
            System.out.println("El id mas grande de la base de datos es:" + idMax);
        }catch(Exception e){
            System.err.print("Error al obtener el ID maximo de los proveedores " + e);
        }finally{
            session.close();

            System.out.println("Sesión de Hibernate cerrada");
        }
        return idMax;
    }
}
