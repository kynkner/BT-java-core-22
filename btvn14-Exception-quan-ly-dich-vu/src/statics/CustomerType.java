package statics;

public enum CustomerType {
    Individual("Cá nhân"),
    RepresentativeOfTheAdministrativeUnit("Đại diện đơn vi hành chính"),
    BusinessUnitRepresentative("Đại diện đơn vị kinh doanh");

    public String value;

    CustomerType(String value) {
        this.value = value;
    }
}
