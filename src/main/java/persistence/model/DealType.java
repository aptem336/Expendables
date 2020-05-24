package persistence.model;

import persistence.controller.DealTypeController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = DealTypeController.getAllNamedQuery, query = "SELECT t FROM DealType t")
public class DealType extends PersistenceModel {
    @NotNull
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealType", orphanRemoval = true)
    private List<Deal> deals;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }
}
