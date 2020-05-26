package controller.action;

import model.action.DealActionModel;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class DealActionController implements ActionController, Serializable {

    private DealActionModel dealActionModel;

    @PostConstruct
    private void postConstruct() {
        dealActionModel = new DealActionModel();
    }

    public String toOutComing() {
        return "outComingDeal";
    }

    public String toInComing() {
        return "inComingDeal";
    }

    public DealActionModel getDealActionModel() {
        return dealActionModel;
    }

    public void setDealActionModel(DealActionModel dealActionModel) {
        this.dealActionModel = dealActionModel;
    }
}
