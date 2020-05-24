package persistence.model;

import persistence.controller.ExpendableController;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = ExpendableController.getAllNamedQuery, query = "SELECT e FROM Expendable e")
public class Expendable extends PersistenceModel {
    @NotNull
    @ManyToOne
    private Maker maker;
    @NotNull
    @ManyToOne
    private ExpendableType expendableType;
    @NotNull
    @ManyToOne
    private Printer printer;
    @NotNull
    private String model;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "expendable", orphanRemoval = true)
    private List<Deal> deals;

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

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
        return getDeals().stream().mapToInt(deal ->
                deal.getAmount() * deal.getDealType().getId() == 0 ? 1 : -1).sum();
    }
}
