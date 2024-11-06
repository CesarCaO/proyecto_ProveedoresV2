package util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            System.out.println("Iniciando configuración de Hibernate..."); // Print de inicio
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            //Aqui se tienen que declarar las clases que seran hechas persistentes mediante AddAnotatedClass
            
            configuration.addAnnotatedClass(Modelos.Proveedor.class);
            
            return configuration.buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Falló la creación del SessionFactory: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
