package controller.action;

import model.Deal;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;

@Named
@ViewScoped
public class DealActionController implements ActionController, Serializable {
    @Inject
    private EntityManager em;
    private Deal deal;

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
        em.merge(deal);
        return "/view/balance?faces-redirect=true";
    }
}
