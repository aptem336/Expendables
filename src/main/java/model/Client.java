package model;

import controller.persistence.ClientController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = ClientController.getAllNamedQuery, query = "SELECT c FROM Client c")
public class Client extends PersistenceModel {
    @NotNull
    private String name;
    @NotNull
    private Integer room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
