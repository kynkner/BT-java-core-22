package statics;

public enum ReaderType {
    STUDENT("SINH VIEN"),
    POST_STUDENT("HOC VIEN CAO HOC"),

    TEACHER("GIANG VIEN");
    public String value;

    ReaderType(String value){
        this.value = value;
    }
}
