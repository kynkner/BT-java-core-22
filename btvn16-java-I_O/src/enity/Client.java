package enity;

import exception.InvaliAgeExcetion;
import statics.CustomerType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    private static int auto_id = 10000;
    private int Id;
    private String Name;
    private String Address;
    private String Phone;
    private CustomerType customerType;

    public Client() {
        Id = auto_id;
        auto_id++;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", phone='" + Phone + '\'' +
                ", customerType=" + customerType +
                '}';
    }

    public static int getAuto_id() {
        return auto_id;
    }

    public static void setAuto_id(int auto_id) {
        Client.auto_id = auto_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

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
        this.Phone = phone;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public void inputInfo() {
        System.out.print("Nhập tên khách hàng: ");
        this.Name = new Scanner(System.in).nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.Address = new Scanner(System.in).nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.Phone = inptPhone();
        System.out.println("Chọn loại khách hàng: ");
        System.out.println("1. Cá nhân");
        System.out.println("2. Tập thể");
        System.out.println("3. Doanh nghiệp");
        int number = inputNumber();
        switch (number){
            case 1:
                this.customerType = CustomerType.individuals;
                break;
            case 2:
                this.customerType = CustomerType.groups;
                break;
            case 3:
                this.customerType = CustomerType.businesses;
                break;
        }

    }

    private int inputNumber() {
        int number;
        do {
            try {
                number = new Scanner(System.in).nextInt();
                valinumber(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("Dữ liệu không hợp lệ, Vui lòng nhập lại: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }

        }while (true);
        return number;
    }

    private void valinumber(int number) throws InvaliAgeExcetion{
        if (number > 0 && number < 4){
            return;
        }
        throw new InvaliAgeExcetion("Không có chức năng, Vui lòng chọn lại: ");
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
