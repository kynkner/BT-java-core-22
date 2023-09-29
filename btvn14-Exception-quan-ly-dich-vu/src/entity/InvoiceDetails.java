package entity;

public class InvoiceDetails {
    private Service service;
    private int quantity;

    public InvoiceDetails(Service service, int quantity) {
        this.service = service;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "InvoiceDetails{" +
                "service=" + service +
                ", quantity=" + quantity +
                '}';
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
