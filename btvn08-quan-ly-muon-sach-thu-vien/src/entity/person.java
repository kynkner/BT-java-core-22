package entity;

import java.util.Scanner;

public class person implements   inputable{

    protected String Name;
    protected String Aadress;
    protected int Phone;

    public void setName(String name) {
        Name = name;
    }

    public void setAadress(String aadress) {
        Aadress = aadress;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public String getAadress() {
        return Aadress;
    }

    public int getPhone() {
        return Phone;
    }

        @Override
    public void inputInfo(){
        System.out.print("Nhap ten ban doc: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhap dia chi: ");
        this.setAadress(new Scanner(System.in).nextLine());
        System.out.print("Nhap so dien thoai: ");
        this.setPhone(new Scanner(System.in).nextInt());

    }

}
