package persistence.controller;

import persistence.model.PersistenceModel;

import javax.faces.convert.Converter;
import java.util.List;

public interface PersistenceController<E extends PersistenceModel> extends Converter<E> {
    List<E> getAll();
}
