package statics;

public enum CustomerType {
    individuals("Cá nhân"),
    groups("Tập thể"),
    businesses("Doanh nghiệp");
    public String value;

    CustomerType(String value) {
        this.value = value;
    }
}
