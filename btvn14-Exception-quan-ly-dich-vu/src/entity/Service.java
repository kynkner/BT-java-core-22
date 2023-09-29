package entity;

import exception.InvaliAgeExcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {
    private static int auto_Id = 100;
    private int Id;
    private String Name;
    private double Rates;
    private String Unit;

    public Service() {
        Id = auto_Id;
        auto_Id++;
    }

    @Override
    public String toString() {
        return "Service{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Rates=" + Rates +
                ", Unit=" + Unit +
                '}';
    }

    public static int getAuto_Id() {
        return auto_Id;
    }

    public static void setAuto_Id(int auto_Id) {
        Service.auto_Id = auto_Id;
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

    public double getRates() {
        return Rates;
    }

    public void setRates(int rates) {
        Rates = rates;
    }

    public String  getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public void inputInfo() {
        System.out.print("Nhập tên dịch vụ: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập giá cước: ");
        this.Rates = inputRates();
        System.out.print("Nhập đơn vị tính: ");
        this.setUnit(new Scanner(System.in).nextLine());
    }

    private double inputRates() {
        double Rates;
        do {
            try {
                Rates = new Scanner(System.in).nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }
        }while (true);
        return Rates;
    }

    public void printServices() {
        System.out.print("Mã dịch vụ: "+Id);
        System.out.print(", Tên dịch vụ: "+Name);
        System.out.print(", Giá cước: "+Rates);
        System.out.print(", Đơn vị tính: "+Unit);
    }
}
