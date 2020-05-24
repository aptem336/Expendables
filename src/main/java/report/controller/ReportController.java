package report.controller;

import report.model.ReportModel;

import java.util.List;

public interface ReportController<E extends ReportModel> {
    List<E> getData();
}
