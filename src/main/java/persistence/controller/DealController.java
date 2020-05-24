package persistence.controller;

import persistence.model.Deal;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class DealController implements PersistenceController<Deal> {
    public static final String getAllNamedQuery = "getAllDeals";
    @Inject
    private EntityManager em;

    @Override
    public List<Deal> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Deal.class).getResultList();
    }

    @Override
    public Deal getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Deal deal) {
        return null;
    }
}
