package model;

import controller.persistence.PrinterController;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NamedQuery(name = PrinterController.getAllNamedQuery, query = "SELECT p FROM Printer p")
public class Printer extends PersistenceModel {
    @NotNull
    @ManyToOne
    private Maker maker;
    @NotNull
    private String model;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "printer", orphanRemoval = true)
    private List<Expendable> expendables;

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Expendable> getExpendables() {
        return expendables;
    }

    public void setExpendables(List<Expendable> expendables) {
        this.expendables = expendables;
    }
}
