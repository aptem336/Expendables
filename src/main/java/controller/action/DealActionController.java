package controller.action;

import model.Deal;
import model.Maker;
import model.Printer;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;

@Named
@ViewScoped//Q
public class DealActionController implements ActionController, Serializable {

    private Deal deal;
    @Inject
    private EntityManager em;
    private Maker maker;
    private Printer printer;

    @PostConstruct
    private void postConstruct() {
        deal = new Deal();
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    @Transactional
    public String save() {
        deal.getExpendable().getDeals().add(deal);
        em.merge(deal.getExpendable());
        return "balance";
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
