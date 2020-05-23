package controller;

import entity.Maker;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class MakerController implements Controller<Maker> {
    public static final String getAllNamedQuery = "getAllMakers";
    @Inject
    private EntityManager em;

    @Override
    public List<Maker> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Maker.class).getResultList();
    }
}
