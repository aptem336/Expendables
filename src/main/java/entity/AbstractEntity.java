package entity;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class AbstractEntity {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }
}
