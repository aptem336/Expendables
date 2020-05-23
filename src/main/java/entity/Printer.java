package entity;

import controller.PrinterController;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = PrinterController.getAllNamedQuery, query = "SELECT p FROM Printer p")
public class Printer extends AbstractEntity {
    @NotNull
    @ManyToOne
    private Maker maker;
    @NotNull
    private String model;

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
}
