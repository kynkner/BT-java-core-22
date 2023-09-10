package bai10;

//Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương trong đoạn [m,n]. Có bao nhiêu số chính phương?

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        System.out.print("Nhap so t nhien m:   ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhap so tu nhien n:   ");
        int n = new Scanner(System.in).nextInt();

        if(m > n){
            System.out.println("Vui long nhap m > n");
            return;
        }
        square(m, n);
    }


    public static boolean soChinhPhuong(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void square(int m, int n) {
      int square = 0;
        for(int i = m; i <= n; i++){
            if(soChinhPhuong(i)){
                square++;
            }
        }
        System.out.println("Co "+square+" so chinh phuong");
    }
}
