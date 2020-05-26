package model;

import controller.persistence.ClientController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = ClientController.getAllNamedQuery, query = "SELECT c FROM Client c")
public class Client extends PersistenceModel {
    @NotNull
    private String name;
    @NotNull
    private Integer room;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acceptor")
    private List<Deal> transactionsAccept;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supplier")
    private List<Deal> transactionsSupply;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public List<Deal> getTransactionsAccept() {
        return transactionsAccept;
    }

    public void setTransactionsAccept(List<Deal> transactionsAccept) {
        this.transactionsAccept = transactionsAccept;
    }

    public List<Deal> getTransactionsSupply() {
        return transactionsSupply;
    }

    public void setTransactionsSupply(List<Deal> transactionsSupply) {
        this.transactionsSupply = transactionsSupply;
    }
}
