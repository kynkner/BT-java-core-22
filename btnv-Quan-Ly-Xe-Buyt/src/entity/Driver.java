package entity;

import statics.DriverLever;

import java.util.Scanner;

public class Driver extends Person {
    public static int auto_id = 10000;
    private int Id;
    private DriverLever driverLever;

    public Driver() {
        this.Id = auto_id;
        auto_id++;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Id=" + Id +
                ", driverLever=" + driverLever.value +
                ", Name='" + Name + '\'' +
                ", Adderss='" + Adderss + '\'' +
                ", phone=" + phone +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public DriverLever getDriverLever() {
        return driverLever;
    }

    public void setDriverLever(DriverLever driverLever) {
        this.driverLever = driverLever;
    }

    public void inputInfo(){
        System.out.println("Mã lái xe: "+auto_id);
        System.out.print("Họ và tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Địa chỉ: ");
        this.setAdderss(new Scanner(System.in).nextLine());
        System.out.print("Số điện thoại: ");
        this.setPhone(new Scanner(System.in).nextInt());
        System.out.println("Trình độ lái xe(Mức từ loại A đến loại F): ");
        System.out.println("1. Trình độ loại A");
        System.out.println("2. Trình độ loại B");
        System.out.println("3. Trình độ loại C");
        System.out.println("4. Trình độ loại D");
        System.out.println("5. Trình độ loại E");
        System.out.println("6. Trình độ loại F");
        System.out.print("Chọn trình độ từ 1 đến 6: ");
        int number = checkNumber();
        switch (number){
            case 1:
                this.driverLever = DriverLever.A;
                break;
            case 2:
                this.driverLever = DriverLever.B;
                break;
            case 3:
                this.driverLever = DriverLever.C;
                break;
            case 4:
                this.driverLever = DriverLever.D;
                break;
            case 5:
                this.driverLever = DriverLever.E;
                break;
            case 6:
                this.driverLever = DriverLever.F;
                break;
        }
    }

    private int checkNumber() {
        int number;
        do {
            number = new Scanner(System.in).nextInt();
            if(number > 0 && number  < 7){
                break;
            }
            System.out.print("NHẬP SAI, Vui lòng Nhập lại (Nhập số 1 đến 6): ");

        }while(true);
        return number;
    }

    public void frintDiver(){
        System.out.print(" Mã lái xe: "+Id);
        System.out.print(", Họ và tên: "+Name);
        System.out.print(", Địa chi: "+Adderss);
        System.out.print(", Số điện thoại: "+phone);
        System.out.print(", Trình độ lái xe: "+driverLever.value);
    }

}
