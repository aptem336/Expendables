package model;

import controller.DateConverter;
import controller.persistence.DealController;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@NamedQuery(name = DealController.getAllNamedQuery, query = "SELECT t FROM Deal t")
public class Deal extends PersistenceModel {
    @NotNull
    @Convert(converter = DateConverter.class)
    private Date date;
    @NotNull
    @ManyToOne(optional = false)
    private Expendable expendable;
    @ManyToOne
    private Client client;
    @NotNull
    private Integer amount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Expendable getExpendable() {
        return expendable;
    }

    public void setExpendable(Expendable expendable) {
        this.expendable = expendable;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client acceptor) {
        this.client = acceptor;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
