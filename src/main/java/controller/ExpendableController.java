package controller;

import entity.Expendable;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class ExpendableController implements Controller<Expendable> {
    public static final String getAllNamedQuery = "getAllExpendables";
    @Inject
    private EntityManager em;

    @Override
    public List<Expendable> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Expendable.class).getResultList();
    }
}
