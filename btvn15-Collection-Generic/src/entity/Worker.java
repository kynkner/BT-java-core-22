package entity;

import exception.InvaliAgeExcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker extends Person{
    private static int auto_id = 1000;
    private int Id;
    private String phone;
    private int WorkerLever;

    public Worker() {
        Id = auto_id;
        auto_id++;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Id=" + Id +
                ", phone='" + phone + '\'' +
                ", WorkerLever=" + WorkerLever +
                ", Name='" + Name + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWorkerLever() {
        return WorkerLever;
    }

    public void setWorkerLever(int workerLever) {
        WorkerLever = workerLever;
    }
    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.print("Nhap so dien thoai: ");
        this.phone =inputPhone();
        System.out.print("Nhap bac tho: ");
        this.WorkerLever = intputWorkerLever();
    }

    private String inputPhone() {
        String number;
        do {
             number = new Scanner(System.in).nextLine();
            String regex = "(84|0[3|5|7|8|9])+([0-9]{8})";
            if (number.matches(regex)) {
                break;
            }
            System.out.println("So dien thoai khong hop le, Vui long nhap lai");
        }while (true);
        return number;
    }


    private int intputWorkerLever() {
        int number;
        do {
            try {
                number = new Scanner(System.in).nextInt();
                valinumber(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }

        }while (true);
        return number;

    }

    private void valinumber(int number) throws InvaliAgeExcetion{
        if (number > 0 && number < 8){
            return;
        }
        throw new InvaliAgeExcetion("du lieu khong hop le, vui long nhap lai: ");
    }
}
