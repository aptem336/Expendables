package model.persistence;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PersistenceModel {
    @Id
    @GeneratedValue
    private Integer id;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(getId(), ((PersistenceModel) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
