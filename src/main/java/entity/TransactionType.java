package entity;

import controller.TransactionTypeController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = TransactionTypeController.getAllNamedQuery, query = "SELECT t FROM TransactionType t")
public class TransactionType extends AbstractEntity {
    @NotNull
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transactionType", orphanRemoval = true)
    private List<Transaction> transactions;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
