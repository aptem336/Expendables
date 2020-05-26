package controller.persistence;

import model.DealType;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class DealTypeController implements PersistenceController<DealType> {
    public static final String getAllNamedQuery = "getAlTransactionTypes";
    @Inject
    private EntityManager em;

    @Override
    public List<DealType> getAll() {
        return em.createNamedQuery(getAllNamedQuery, DealType.class).getResultList();
    }

    @Override
    public DealType getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, DealType dealType) {
        return dealType.getId() + "";
    }
}
