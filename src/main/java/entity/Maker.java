package entity;

import controller.MakerController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = MakerController.getAllNamedQuery, query = "SELECT m FROM Maker m")
public class Maker extends AbstractEntity {
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
