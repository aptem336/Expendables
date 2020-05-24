package controller;

import entity.AbstractEntity;

import javax.faces.convert.Converter;
import java.util.List;

public interface Controller<E extends AbstractEntity> extends Converter<E> {
    List<E> getAll();
}
