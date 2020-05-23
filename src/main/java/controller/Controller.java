package controller;

import entity.AbstractEntity;

import java.util.List;

public interface Controller<E extends AbstractEntity> {
    List<E> getAll();
}
