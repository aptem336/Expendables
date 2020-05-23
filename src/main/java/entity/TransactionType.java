package entity;

import controller.TransactionTypeController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = TransactionTypeController.getAllNamedQuery, query = "SELECT t FROM TransactionType t")
public class TransactionType extends AbstractEntity {
    @NotNull
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
