package entity;

public class Person {
    protected String Name;
    protected String Adderss;
    protected int phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdderss() {
        return Adderss;
    }

    public void setAdderss(String adderss) {
        Adderss = adderss;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
