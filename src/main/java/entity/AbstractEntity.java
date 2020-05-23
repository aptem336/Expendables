package entity;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class AbstractEntity {
    @Id
    @GeneratedValue
    private Integer id;

    public int getId() {
        return id;
    }
}
