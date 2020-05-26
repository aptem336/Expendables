package model.persistence;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PersistenceModel {
    @Id
    @GeneratedValue
    private Integer id;

    public int getId() {
        return id;
    }
}
