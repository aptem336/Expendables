package entity;

import controller.ExpendableController;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = ExpendableController.getAllNamedQuery, query = "SELECT e FROM Expendable e")
public class Expendable extends AbstractEntity {
    @NotNull
    @ManyToOne
    private Maker maker;
    @NotNull
    @ManyToOne
    private ExpendableType expendableType;
    @NotNull
    @ManyToOne
    private Printer printer;
    @NotNull
    private String model;

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public ExpendableType getExpendableType() {
        return expendableType;
    }

    public void setExpendableType(ExpendableType expendableType) {
        this.expendableType = expendableType;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
