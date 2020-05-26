package controller.persistence;

import model.persistence.Client;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class ClientController implements PersistenceController<Client> {
    public static final String getAllNamedQuery = "getAllClients";
    @Inject
    private EntityManager em;

    @Override
    public List<Client> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Client.class).getResultList();
    }

    @Override
    public Client getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        return em.find(Client.class, Integer.parseInt(id));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Client client) {
        return client == null ? null : client.getId() + "";
    }
}
