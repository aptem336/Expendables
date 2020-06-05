package controller.filter;

import model.Expendable;
import model.ExpendableType;
import model.Maker;
import model.Printer;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Named
@ViewScoped
public class ExpendableFilter implements Serializable {

    private ExpendableType expendableType;
    private Maker maker;
    private Printer printer;

    public ExpendableType getExpendableType() {
        return expendableType;
    }

    public void setExpendableType(ExpendableType expendableType) {
        this.expendableType = expendableType;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public List<ExpendableType> filterExpendableType(List<ExpendableType> expendablesTypes) {
        return expendablesTypes;
    }

    public List<Maker> filterMakers(List<Maker> makers) {
        return makers;
    }

    public List<Printer> filterPrinters(List<Printer> printers) {
        if (maker != null) {
            return maker.getPrinters();
        }
        return printers;
    }

    public List<Expendable> filterExpendables(List<Expendable> expendables) {
        Stream<Expendable> expendableStream = expendables.stream();
        if (expendableType != null) {
            expendableStream = expendableStream.filter(expendable -> expendable.getExpendableType().equals(expendableType));
        }
        if (printer != null) {
            expendableStream = expendableStream.filter(expendable -> expendable.getPrinter().equals(printer));
        }
        if (maker != null) {
            expendableStream = expendableStream.filter(expendable -> expendable.getPrinter().getMaker().equals(maker));
        }
        return expendableStream.collect(Collectors.toList());
    }
}
