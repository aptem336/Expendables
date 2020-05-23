package controller;

import entity.Client;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class ClientController implements Controller<Client> {
    public static final String getAllNamedQuery = "getAll";
    @Inject
    private EntityManager em;

    @Override
    public List<Client> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Client.class).getResultList();
    }
}
