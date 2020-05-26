package model.action;

import model.persistence.*;

import java.util.Date;

public class DealActionModel implements ActionModel {
    private DealType dealType;
    private Date dealDate;
    private Client dealClient;
    private Maker dealMaker;
    private Printer dealPrinter;
    private Expendable dealExpendable;
    private Integer dealAmount;

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

    public Maker getDealMaker() {
        return dealMaker;
    }

    public void setDealMaker(Maker dealMaker) {
        this.dealMaker = dealMaker;
    }

    public Printer getDealPrinter() {
        return dealPrinter;
    }

    public void setDealPrinter(Printer dealPrinter) {
        this.dealPrinter = dealPrinter;
    }

    public Expendable getDealExpendable() {
        return dealExpendable;
    }

    public void setDealExpendable(Expendable dealExpendable) {
        this.dealExpendable = dealExpendable;
    }

    public Integer getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Integer dealAmount) {
        this.dealAmount = dealAmount;
    }
}
