package entity;

public class AssignmentTableBorrow {
    private Gland gland;
    public int quantity;

    public AssignmentTableBorrow(Gland gland, int quantity) {
        this.gland = gland;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "AssignmentTableBorrow{" +
                "gland=" + gland +
                ", quantity=" + quantity +
                '}';
    }

    public Gland getGland() {
        return gland;
    }

    public void setGland(Gland gland) {
        this.gland = gland;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
