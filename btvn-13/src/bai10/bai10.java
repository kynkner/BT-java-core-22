package bai10;

//Loại bỏ chuỗi S1 từ chuỗi S2 với S1, S2 nhập vào từ bàn phím.

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        System.out.print("Nhap chuoi S1: ");
        String S1 = new Scanner(System.in).nextLine();

        System.out.print("Nhap chuoi S2: ");
        String S2 = new Scanner(System.in).nextLine();

        String result = S2.replaceAll(S1, "");

        System.out.println("Chuoi moi: "+ result);
    }
}
