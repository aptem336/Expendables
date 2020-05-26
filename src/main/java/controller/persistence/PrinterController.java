package controller.persistence;

import model.persistence.Printer;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class PrinterController implements PersistenceController<Printer> {
    public static final String getAllNamedQuery = "getAllPrinters";
    @Inject
    private EntityManager em;

    @Override
    public List<Printer> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Printer.class).getResultList();
    }

    @Override
    public Printer getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Printer printer) {
        return printer.getModel();
    }
}
