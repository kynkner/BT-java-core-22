package entity;

import java.util.Arrays;

public class Invoive {
    private Client client;
    private InvoiceDetails[] details;
    private int total;

    public Invoive(Client client, InvoiceDetails[] details, int total) {
        this.client = client;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Invoive{" +
                "client=" + client +
                ", details=" + Arrays.toString(details) +
                ", total=" + total +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public InvoiceDetails[] getDetails() {
        return details;
    }

    public void setDetails(InvoiceDetails[] details) {
        this.details = details;
    }
}
