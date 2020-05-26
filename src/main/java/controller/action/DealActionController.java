package controller.action;

import model.persistence.Client;
import model.persistence.DealType;

import javax.inject.Named;
import javax.validation.constraints.Max;
import java.util.Date;

@Named
public class DealActionController implements ActionController {
    private DealType dealType;
    private Date dealDate;
    private Client dealClient;
    @Max(value = 3)
    private Integer dealAmount;

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

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Client getDealClient() {
        return dealClient;
    }

    public void setDealClient(Client dealClient) {
        this.dealClient = dealClient;
    }

    public Integer getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Integer dealAmount) {
        this.dealAmount = dealAmount;
    }
}
