package controller;

import entity.Maker;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
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

    @Override
    public Maker getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Maker maker) {
        return maker.getName();
    }
}
