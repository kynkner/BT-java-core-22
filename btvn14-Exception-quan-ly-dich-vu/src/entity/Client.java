package entity;

import exception.InvaliAgeExcetion;
import statics.CustomerType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static int auto_id = 10000;
    private int Id;
    private String Name;
    private String Adress;
    private int Phone;
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
                ", Adress='" + Adress + '\'' +
                ", Phone=" + Phone +
                ", customerType=" + customerType.value +
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

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
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
        System.out.print("Nhập địa chỉ khách hàng: ");
        this.setAdress(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điên thoại: ");
        this.Phone = inputPhone();
        System.out.println("Chon 1 trong các loại khách hàng sau: ");
        System.out.println("1. Cá nhân");
        System.out.println("2. Đại diện đơn vị hành chính");
        System.out.println("3. Đại diện đơn vị kinh doanh");
        int number = inputNumber();
        switch (number){
            case 1:
                this.customerType = CustomerType.Individual;
                break;
            case 2:
                this.customerType = CustomerType.RepresentativeOfTheAdministrativeUnit;
                break;
            case 3:
                this.customerType = CustomerType.BusinessUnitRepresentative;
                break;
        }
    }

    private int inputNumber() {
        System.out.print("Vui long chon chuc nang: ");
        int number;
        do {
            try{
                number = new Scanner(System.in).nextInt();
                valinumber(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }
            catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }

        }while (true);
        return number;

    }

    private void valinumber(int number) throws InvaliAgeExcetion{
        if (number > 0 && number < 4){
            return;
        }
        throw new InvaliAgeExcetion("Khong co chuc nang, vui long nhap lai: ");
    }

    private int inputPhone() {
        int numberphone;
        do {
            try {
                numberphone = new Scanner(System.in).nextInt();
                valinumberphone(numberphone);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
        return numberphone;

    }

    private void valinumberphone(int numberphone) throws InvaliAgeExcetion {
        if(numberphone < 0 || numberphone > 11){
            return;
        }
        throw new InvaliAgeExcetion("So dien thoai co 10 so, Vui long nhap lai: ");
    }

    public void printClients() {
        System.out.print("Mã khách hàng: "+Id);
        System.out.print(", Tên khách hàng: "+Name);
        System.out.print(", Đia chỉ: "+Adress);
        System.out.print(", Số điện thoại: "+Phone);
        System.out.print(", Loại khách hàng: "+customerType.value);
    }
}
