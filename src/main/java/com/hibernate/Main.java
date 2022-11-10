package com.hibernate;

// import hibernate
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    // hibernate configuration
    public static void main(String[] args) {

        hibernateConfiguration();
    }

    public static void hibernateConfiguration() {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BRANCH.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a BRANCH object
            /*
 * table name: BRANCH
 * columns: BRANCH_ID, ADDRESS, CITY, NAME, STATE, ZIP_CODE
 */
            System.out.println("Creating new branch object...");
            BRANCH branch = new BRANCH("Branch 1", "123 Main St", "New York", "NY", "12345");

            // start a transaction
            session.beginTransaction();

            // save the BRANCH object
            System.out.println("Saving the branch...");
            session.save(branch);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
    
}

