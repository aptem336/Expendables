package model;

import controller.persistence.DealTypeController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = DealTypeController.getAllNamedQuery, query = "SELECT t FROM DealType t")
public class DealType extends PersistenceModel {
    @NotNull
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
