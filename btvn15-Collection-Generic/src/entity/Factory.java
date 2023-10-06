package entity;

import exception.InvaliAgeExcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factory implements inputable{
    private static int auto_id = 100;
    private int Id;
    private String Name;
    private String Description;
    private int WorkCoefficient;

    public Factory() {
        Id = auto_id;
        auto_id++;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", WorkCoefficient=" + WorkCoefficient +
                '}';
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getWorkCoefficient() {
        return WorkCoefficient;
    }

    public void setWorkCoefficient(int workCoefficient) {
        WorkCoefficient = workCoefficient;
    }
    @Override
    public void inputInfo() {
        System.out.print("Nhap ten xuong san xuat: ");
        this.Name = new Scanner(System.in).nextLine();
        System.out.print("Nhap mo ta: ");
        this.Description = new Scanner(System.in).nextLine();
        System.out.print("Nhap he so cong viec: ");
        this.WorkCoefficient = input();
    }

    private int input() {
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
