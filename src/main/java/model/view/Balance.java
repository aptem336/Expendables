package model.view;

import model.persistence.Expendable;
import model.persistence.ExpendableType;

public class Balance extends ViewModel {
    private ExpendableType expendableType;
    private String printerModel;
    private String expendableModel;
    private Integer balance;

    public Balance(Expendable balance) {
        this.expendableType = balance.getExpendableType();
        this.printerModel = balance.getPrinter().getModel();
        this.expendableModel = balance.getModel();
        this.balance = balance.getBalance();
    }

    public ExpendableType getExpendableType() {
        return expendableType;
    }

    public void setExpendableType(ExpendableType expendableType) {
        this.expendableType = expendableType;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public String getExpendableModel() {
        return expendableModel;
    }

    public void setExpendableModel(String expendableModel) {
        this.expendableModel = expendableModel;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
