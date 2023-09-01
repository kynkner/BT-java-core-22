package bai1;

//Viết chương trình nhập vào 4 số nguyên a, b, c và d. In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        System.out.println("Nhap so a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhap so b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhap so c:");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Nhap so d:");
        int d = new Scanner(System.in).nextInt();
        if( a > b && a > c && a > d){
            System.out.println(a+" la so lon nhat");
        }else if(b > c && c > d){
            System.out.println(b+" la so lon nhat");
        }else if(c > d){
            System.out.println(c+" la so lon nhat");
        }else{
            System.out.println(d+" la so lon nhat");
        }

    }

}
