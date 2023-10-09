package enity;

public class SavingsNumberDetail {
    private Bank bank;
    private long quantity;

    public SavingsNumberDetail(Bank bank, long quantity) {
        this.bank = bank;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SavingsNumberDetail{" +
                "bank=" + bank +
                ", quantity=" + quantity +
                '}';
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
