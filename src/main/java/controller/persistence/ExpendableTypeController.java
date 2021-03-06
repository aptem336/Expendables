package controller.persistence;

import model.ExpendableType;

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
    public ExpendableType getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        return em.find(ExpendableType.class, id);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, ExpendableType expendableType) {
        return expendableType == null ? "" : expendableType.getId() + "";
    }
}
