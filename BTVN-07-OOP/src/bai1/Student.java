package bai1;

import java.util.Scanner;

public class Student {
    public String id;
    public String Name;
    public String Class;
    public String LockUp;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", Class='" + Class + '\'' +
                ", LockUp='" + LockUp + '\'' +
                '}';
    }

    public Student(String id, String name, String aClass, String lockUp) {
        this.id = id;
        Name = name;
        Class = aClass;
        LockUp = lockUp;
    }
    public void declareInformation(){
        System.out.print("Nhap Ma sinh vien: ");
        this.id = new Scanner(System.in).nextLine();

        System.out.print("Nhap Ho Va Ten Sinh Vien: ");
        this.Name = new Scanner(System.in).nextLine();

        System.out.print("Nhap Lop Cua Sinh Vien: ");
        this.Class = new Scanner(System.in).nextLine();

        System.out.print("Nhap Khoa sinh vien: ");
        this.LockUp = new Scanner(System.in).nextLine();
    }
}
