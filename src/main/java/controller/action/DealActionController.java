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
    private Integer sign;
    private Deal deal;

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

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
        deal.setAmount(deal.getAmount() * sign);
        deal.getExpendable().getDeals().add(deal);
        em.merge(deal.getExpendable());
        return "/view/balance?faces-redirect=true";
    }
}
