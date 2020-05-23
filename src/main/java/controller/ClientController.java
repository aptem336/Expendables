package controller;

import entity.Client;
import helper.ClientPersistenceHelper;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

public class ClientController implements Controller<Client> {
    @Inject
    private ClientPersistenceHelper helper;
    @Inject
    private EntityManager em;

    @Override
    public List<Client> getAll() {
        return em.createNamedQuery(helper.getAllNamedQuery(), Client.class).getResultList();
    }
}
