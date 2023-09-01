package bai10;

//Viết chương trình nhập số nguyên h và in ra màn hình tam giác cân có độ cao h. Ví dụ với h=4:

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {

        System.out.print("Nhap chieu cao cua tam giac can:  ");
        int h = new Scanner(System.in).nextInt();

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= h - i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <=  i * 2 - 1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
