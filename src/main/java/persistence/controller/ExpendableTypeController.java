package persistence.controller;

import persistence.model.ExpendableType;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class ExpendableTypeController implements PersistenceController<ExpendableType> {
    public static final String getAllNamedQuery = "getAllExpendableTypes";
    @Inject
    private EntityManager em;

    @Override
    public List<ExpendableType> getAll() {
        return em.createNamedQuery(getAllNamedQuery, ExpendableType.class).getResultList();
    }

    @Override
    public ExpendableType getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, ExpendableType expendableType) {
        return expendableType.getType();
    }
}
