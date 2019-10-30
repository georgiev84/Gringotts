package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Gringotts {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("gringotts");
        EntityManager entityManager = factory.createEntityManager();

        Runnable engine = new Engine(entityManager);
        engine.run();
    }
}
