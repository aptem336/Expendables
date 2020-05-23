package entity;

import controller.ExpendableTypeController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = ExpendableTypeController.getAllNamedQuery, query = "SELECT e FROM ExpendableType e")
public class ExpendableType extends AbstractEntity {
    @NotNull
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "expendableType", orphanRemoval = true)
    private List<Expendable> expendables;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Expendable> getExpendables() {
        return expendables;
    }

    public void setExpendables(List<Expendable> expendables) {
        this.expendables = expendables;
    }
}
