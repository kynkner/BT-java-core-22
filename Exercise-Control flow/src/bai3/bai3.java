package bai3;

//Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        System.out.println("Nhap so a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhap so b:");
        int b = new Scanner(System.in).nextInt();

        int USLN = 1;
        while (a != b) {
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    USLN = i;
                }
            }
            System.out.println("Uoc so lon nhat cua " + a + " va " + b + " la:   " + USLN);
            System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la:   " +((a * b) / USLN));
            break;
        }
    }

}
