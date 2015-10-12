package controladores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JGLEDWARD
 */
public class EntityController {

    private EntityManagerFactory emf;

    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("XpressCurierWsPU");
        }
        return emf.createEntityManager();
    }
}
