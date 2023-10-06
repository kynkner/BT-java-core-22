package entity;

import java.util.Scanner;

public class Person implements inputable{
    protected String Name;
    private String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhap ten cong nhan: ");
        this.Name = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi cong nhan: ");
        this.Address = new Scanner(System.in).nextLine();

    }
}
