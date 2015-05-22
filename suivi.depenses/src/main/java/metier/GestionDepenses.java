package metier;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import domain.OrdreMission;

@Named
@RequestScoped
public class GestionDepenses {
    @PersistenceContext(unitName = "suiviDepenses")
    private EntityManager entityManager;

    private List<OrdreMission> ordresMissions;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    @PostConstruct
    public void listerOrdreMission() {
        final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        final CriteriaQuery<OrdreMission> criteriaQuery = criteriaBuilder.createQuery(OrdreMission.class);
        final Root<OrdreMission> root = criteriaQuery.from(OrdreMission.class);
        final CriteriaQuery<OrdreMission> query = criteriaQuery.select(root);
        ordresMissions = entityManager.createQuery(query).getResultList();
    }

    /**
     * @return the ordresMissions
     */
    public List<OrdreMission> getOrdresMissions() {
        return ordresMissions;
    }
}
