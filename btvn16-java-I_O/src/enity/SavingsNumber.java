package enity;

import java.util.List;

public class SavingsNumber {
    private Client client;
    private List<SavingsNumberDetail> details;
    private long total;

    public SavingsNumber(Client client, List<SavingsNumberDetail> details, long total) {
        this.client = client;
        this.details = details;
        this.total = total;
    }

    @Override
    public String toString() {
        return "SavingsNumber{" +
                "client=" + client +
                ", details=" + details +
                ", total=" + total +
                '}';
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<SavingsNumberDetail> getDetails() {
        return details;
    }

    public void setDetails(List<SavingsNumberDetail> details) {
        this.details = details;
    }
}
