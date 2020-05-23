package entity;

import controller.MakerController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = MakerController.getAllNamedQuery, query = "SELECT m FROM Maker m")
public class Maker extends AbstractEntity {
    @NotNull
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maker", orphanRemoval = true)
    private List<Printer> printers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Printer> getPrinters() {
        return printers;
    }

    public void setPrinters(List<Printer> printers) {
        this.printers = printers;
    }
}
