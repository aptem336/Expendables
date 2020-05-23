package controller;

import entity.Printer;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class PrinterController implements Controller<Printer> {
    public static final String getAllNamedQuery = "getAllPrinters";
    @Inject
    private EntityManager em;

    @Override
    public List<Printer> getAll() {
        return em.createNamedQuery(getAllNamedQuery, Printer.class).getResultList();
    }
}
