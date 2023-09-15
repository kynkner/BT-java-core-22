package bai7;

import java.util.Scanner;

public class Student7 {
    public String Id;
    public String Name;
    public String Address;
    public String Gender;
    public float Gpa;
    public String Department;

    public Student7(){

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

    public Student7(String id, String name, String address, String gender, float gpa, String department) {
        Id = id;
        Name = name;
        Address = address;
        Gender = gender;
        Gpa = gpa;
        Department = department;
    }
    public void declareInformation(){
        System.out.print("Ma Sinh Vien: ");
        this.Id = new Scanner(System.in).nextLine();

        System.out.print("Ho Va Ten: ");
        this.Name = new Scanner(System.in).nextLine();

        System.out.print("Que Quan: ");
        this.Address = new Scanner(System.in).nextLine();

        System.out.print("Gioi Tinh: ");
        this.Gender = new Scanner(System.in).nextLine();

        System.out.print("Diem Trung Binh: ");
        this.Gpa = new Scanner(System.in).nextFloat();

        System.out.print("Nganh: ");
        this.Department = new Scanner(System.in).nextLine();

    }
    public void showStudents(){
        System.out.print(" Ma Sinh Vien: "+Id);
        System.out.print(", Ho Va Ten: "+Name);
        System.out.print(", Que Quan: "+Address);
        System.out.print(", Gioi Tinh: "+Gender);
        System.out.print(", Diem Trung Binh: "+Gpa);
        System.out.print(", Nganh: "+Department);
    }
}
