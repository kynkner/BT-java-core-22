package bai8;

import java.util.Scanner;

public class Student8 {
    public String Id;
    public String Name;
    public String Address;
    public String Gender;
    public float Gpa;
    public String Department;

    public Student8(){

    }
    @Override
    public String toString() {
        return "Student6{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Gpa=" + Gpa +
                ", Department='" + Department + '\'' +
                '}';
    }

    public Student8(String id, String name, String address, String gender, float gpa, String department) {
        Id = id;
        Name = name;
        Address = address;
        Gender = gender;
        Gpa = gpa;
        Department = department;
    }
    public void declareInformation(){
        System.out.println("Nhap Ma Sinh Vien: ");
        this.Id = new Scanner(System.in).nextLine();

        System.out.println("Nhap Ma Sinh Vien: ");
        this.Name = new Scanner(System.in).nextLine();

        System.out.println("Nhap Ma Sinh Vien: ");
        this.Address = new Scanner(System.in).nextLine();

        System.out.println("Nhap Ma Sinh Vien: ");
        this.Gender = new Scanner(System.in).nextLine();

        System.out.println("Nhap Ma Sinh Vien: ");
        this.Gpa = new Scanner(System.in).nextFloat();

        System.out.println("Nhap Ma Sinh Vien: ");
        this.Department = new Scanner(System.in).nextLine();

    }
}
