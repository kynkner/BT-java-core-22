package bai2;

import java.util.Scanner;

public class Student2 {
    public String Id;
    public String Name;
    public String Class;
    public String LockUp;

    public Student2(){

    }

    @Override
    public String toString() {
        return "Student2{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Class='" + Class + '\'' +
                ", LockUp='" + LockUp + '\'' +
                '}';
    }

    public Student2(String id, String name, String aClass, String lockUp) {
        this.Id = id;
        this.Name = name;
        this.Class = aClass;
        this.LockUp = lockUp;
    }
    public void declareInformation(){
        System.out.print("Nhap Ma sinh vien: ");
        this.Id = new Scanner(System.in).nextLine();

        System.out.print("Nhap Ho Va Ten Sinh Vien: ");
        this.Name = new Scanner(System.in).nextLine();

        System.out.print("Nhap Lop Cua Sinh Vien: ");
        this.Class = new Scanner(System.in).nextLine();

        System.out.print("Nhap Khoa sinh vien: ");
        this.LockUp = new Scanner(System.in).nextLine();
    }
    public void showStudents(){
        System.out.print(" Ma Sinh Vien: "+Id);
        System.out.print(", Ho Va Ten: "+Name);
        System.out.print(", Lop: "+Class);
        System.out.print(", Nganh: "+LockUp);
    }
}
