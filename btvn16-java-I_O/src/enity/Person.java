package enity;

import java.util.Scanner;

public class Person implements InputInfo{
    protected String Name;
    protected String Address;
    protected String Phone;

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

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public void inputInfo(){
        System.out.print("Nhập tên khách hàng: ");
        this.Name = new Scanner(System.in).nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.Address = new Scanner(System.in).nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.Phone = inptPhone();
    }
    private String inptPhone() {
        String number;
        do {
            number = new Scanner(System.in).nextLine();
            String regex = "(84|0[3|5|7|8|9])+([0-9]{8})";
            if (number.matches(regex)) {
                break;
            }
            System.out.print("So dien thoai khong hop le, Vui long nhap lai: ");
        }while (true);
        return number;
    }
}
