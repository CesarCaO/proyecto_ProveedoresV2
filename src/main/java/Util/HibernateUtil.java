package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author edwin-993
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory=buildSessionFactory();
    
     private static SessionFactory buildSessionFactory() {
       try {
           
            Configuration cfg=new Configuration();
            cfg.configure("hibernate.cfg.xml");
           
            cfg.addAnnotatedClass(Entidades.PiezaProveedor.class);
            cfg.addAnnotatedClass(Entidades.Pieza.class);
            cfg.addAnnotatedClass(Entidades.Proveedor.class);
            cfg.addAnnotatedClass(Entidades.Compra.class);
            cfg.addAnnotatedClass(Entidades.CompraProveedor.class);
            
            return cfg.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("build SeesionFactory failed :" + ex);
            throw new ExceptionInInitializerError(ex);
        }
  }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
     public static void shutdown() {
        getSessionFactory().close();
    }
}