package controller.view;

import controller.persistence.ExpendableController;
import model.view.Balance;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.stream.Collectors;

@Named
public class BalanceController implements ViewController<Balance> {
    @Inject
    private ExpendableController expendableController;

    @Override
    public List<Balance> getData() {
        return expendableController.getAll().stream().map(Balance::new).collect(Collectors.toList());
    }
}
