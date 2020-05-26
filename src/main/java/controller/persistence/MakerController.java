package controller.persistence;

import model.persistence.Maker;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class MakerController implements PersistenceController<Maker> {
    public static final String getAllNamedQuery = "getAllMakers";
    @Inject
    private EntityManager em;

    @Override
    public List<Maker> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Maker.class).getResultList();
    }

    @Override
    public Maker getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        return getAll().stream().filter(maker -> maker.getId() == Integer.parseInt(id)).findFirst().orElse(null);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Maker maker) {
        return maker.getId() + "";
    }
}
