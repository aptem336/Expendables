package controller;

import entity.TransactionType;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class TransactionTypeController implements Controller<TransactionType> {
    public static final String getAllNamedQuery = "getAlTransactionTypes";
    @Inject
    private EntityManager em;

    @Override
    public List<TransactionType> getAll() {
        return em.createNamedQuery(getAllNamedQuery, TransactionType.class).getResultList();
    }
}
