package controller.persistence;

import model.persistence.Expendable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class ExpendableController implements PersistenceController<Expendable> {
    public static final String getAllNamedQuery = "getAllExpendables";
    @Inject
    private EntityManager em;

    @Override
    public List<Expendable> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Expendable.class).getResultList();
    }

    @Override
    public Expendable getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        return em.find(Expendable.class, Integer.parseInt(id));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Expendable expendable) {
        return expendable == null ? null : expendable.getId() + "";
    }
}
