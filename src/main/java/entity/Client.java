package entity;

import helper.ClientPersistenceHelper;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = ClientPersistenceHelper.getAllNamedQuery, query = "SELECT c FROM Client c")
public class Client extends AbstractEntity {
    private String name;
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
