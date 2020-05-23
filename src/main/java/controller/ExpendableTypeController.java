package controller;

import entity.ExpendableType;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class ExpendableTypeController implements Controller<ExpendableType> {
    public static final String getAllNamedQuery = "getAllExpendableTypes";
    @Inject
    private EntityManager em;

    @Override
    public List<ExpendableType> getAll() {
        return em.createNamedQuery(getAllNamedQuery, ExpendableType.class).getResultList();
    }
}
