package statics;

public enum Specialized {
    NaturalSciences("Khoa hoc tu nhien"),
    LiteratureArts("Van hoc - Nghe thuat"),
    ElectronicsandTelecommunication("Dien tu vien thong"),
    Informationtechnology("Cong nghe thong tin");

    public String value;
    Specialized( String value) {
        this.value = value;
    }
}
