package controller.filter;

import model.*;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Named
@ViewScoped
public class ExpendableFilter implements Serializable {

    private String client_name;
    private Client client;
    private ExpendableType expendableType;
    private Maker maker;
    private Printer printer;
    private Expendable expendable;
    private Date dateFrom;
    private Date dateTo;

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public List<Client> filterClient(List<Client> clients) {
        if (client_name != null) {
            return clients.stream().filter(client -> client.getName().equals(client_name)).collect(Collectors.toList());
        }
        return clients;
    }

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

    public Expendable getExpendable() {
        return expendable;
    }

    public void setExpendable(Expendable expendable) {
        this.expendable = expendable;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Deal> filterDeals(List<Deal> deals) {
        Stream<Deal> dealStream = deals.stream().filter(deal -> deal.getAmount() < 0);
        if (dateFrom != null) {
            dealStream = dealStream.filter(deal -> deal.getDate().after(dateFrom));
        }
        if (dateTo != null) {
            dealStream = dealStream.filter(deal -> deal.getDate().before(dateTo));
        }
        if (client != null) {
            dealStream = dealStream.filter(deal -> deal.getClient().equals(client));
        }
        return dealStream.collect(Collectors.toList());
    }
}
