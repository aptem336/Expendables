package model;

import controller.persistence.ExpendableController;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = ExpendableController.getAllNamedQuery, query = "SELECT e FROM Expendable e")
public class Expendable extends PersistenceModel {
    @ManyToOne(optional = false)
    private Printer printer;
    @ManyToOne(optional = false)
    private ExpendableType expendableType;
    @NotNull
    private String model;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "expendable", orphanRemoval = true)
    private List<Deal> deals;

    public ExpendableType getExpendableType() {
        return expendableType;
    }

    public void setExpendableType(ExpendableType expendableType) {
        this.expendableType = expendableType;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    @Transient
    public Integer getBalance() {
        return getDeals().stream().mapToInt(Deal::getAmount).sum();
    }
}
