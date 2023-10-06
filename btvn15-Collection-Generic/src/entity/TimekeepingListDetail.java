package entity;

public class TimekeepingListDetail {
    private Factory factory;
    private int Quantity;

    public TimekeepingListDetail(Factory factory, int quantity) {
        this.factory = factory;
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "TimekeepingListDetail{" +
                "factory=" + factory +
                ", Quantity=" + Quantity +
                '}';
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
