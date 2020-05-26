package controller.action;

import model.persistence.DealType;

import javax.inject.Named;

@Named
public class DealActionController implements ActionController {
    private DealType dealType;

    public String toOutComing() {
        return "outComingDeal";
    }

    public String toInComing() {
        return "inComingDeal";
    }

    public DealType getDealType() {
        return dealType;
    }

    public void setDealType(DealType dealType) {
        this.dealType = dealType;
    }
}
