package bai6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Student6[] listStudent = moreStuden();

        System.out.println("Danh sach sinh vien:  ");
        printStudent(listStudent);

        randomStudents(listStudent);
        printStudent(listStudent);

        eliminateStudents(listStudent);
        printListStudents(listStudent);

    }

    public static void printStudent(Student6[] mangsv) {
        for (int i = 0; i < mangsv.length; i++) {
            System.out.print("Thong tin sinh vien "+(i+1)+" :");
            mangsv[i].showStudents();
            System.out.println();
        }
    }
    public static void randomStudents(Student6[] mangsv) {
        int random = new Random().nextInt(mangsv.length);
        System.out.println("Doi gia tri sinh vien "+(random+1)+" : ");
        mangsv[random].declareInformation();
        System.out.println("Sinh vien "+(random+1)+" da thay doi: ");
    }

    public static void eliminateStudents(Student6[] mangsv) {
            int random = -1;
        do{
             random = new Random().nextInt(mangsv.length);
            System.out.println("Loai bo sinh vien "+(random + 1)+" :");
        }
        while (mangsv[random] == null);
                mangsv[random] = null;
    }

    public static void printListStudents(Student6[] listStudents) {
        for (int i = 0; i < listStudents.length; i++) {
            if(listStudents[i] != null){
                System.out.print("Thong tin sinh vien "+(i+1)+" :");
                listStudents[i].showStudents();
                System.out.println();
            }
        }
    }
    public static Student6[] moreStuden(){
        System.out.print("Nhap so luong sinh vien:  ");
        int n =  new Scanner(System.in).nextInt();

        Student6[] mangsv = new Student6[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu "+(i+1)+" :");
            mangsv[i] = new Student6();
            mangsv[i].declareInformation();
        }
        return  mangsv;
    }
}
