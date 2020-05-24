package controller;

import entity.Transaction;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class TransactionController implements Controller<Transaction> {
    public static final String getAllNamedQuery = "getAllTransactions";
    @Inject
    private EntityManager em;

    @Override
    public List<Transaction> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Transaction.class).getResultList();
    }
}
