package controller;

import entity.Deal;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class TransactionController implements Controller<Deal> {
    public static final String getAllNamedQuery = "getAllTransactions";
    @Inject
    private EntityManager em;

    @Override
    public List<Deal> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Deal.class).getResultList();
    }
}
