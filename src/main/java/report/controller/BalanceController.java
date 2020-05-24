package report.controller;

import persistence.controller.ExpendableController;
import report.model.Balance;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.stream.Collectors;

@Named
public class BalanceController implements ReportController<Balance> {
    @Inject
    private ExpendableController expendableController;

    @Override
    public List<Balance> getData() {
        return expendableController.getAll().stream().map(Balance::new).collect(Collectors.toList());
    }
}
