package persistence.model;

import persistence.controller.DealController;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = DealController.getAllNamedQuery, query = "SELECT t FROM Deal t")
public class Deal extends PersistenceModel {
    @NotNull
    @ManyToOne
    private Expendable expendable;
    @NotNull
    @ManyToOne
    private Client supplier;
    @NotNull
    @ManyToOne
    private Client acceptor;
    @NotNull
    private Integer amount;
    @NotNull
    @ManyToOne
    private DealType dealType;

    public Expendable getExpendable() {
        return expendable;
    }

    public void setExpendable(Expendable expendable) {
        this.expendable = expendable;
    }

    public Client getSupplier() {
        return supplier;
    }

    public void setSupplier(Client supplier) {
        this.supplier = supplier;
    }

    public Client getAcceptor() {
        return acceptor;
    }

    public void setAcceptor(Client acceptor) {
        this.acceptor = acceptor;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public DealType getDealType() {
        return dealType;
    }

    public void setDealType(DealType dealType) {
        this.dealType = dealType;
    }
}
