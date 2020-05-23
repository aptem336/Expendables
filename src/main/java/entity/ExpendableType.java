package entity;

import controller.ExpendableTypeController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = ExpendableTypeController.getAllNamedQuery, query = "SELECT e FROM ExpendableType e")
public class ExpendableType extends AbstractEntity {
    @NotNull
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
