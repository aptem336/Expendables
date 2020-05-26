package controller.view;

import model.view.ViewModel;

import java.util.List;

public interface ViewController<E extends ViewModel> {
    List<E> getData();
}
