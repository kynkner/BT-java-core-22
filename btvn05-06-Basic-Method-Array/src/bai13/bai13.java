package bai13;

import java.util.Scanner;

//Nhập số tự nhiên n rồi tính tổng: sum = 1 + 1/2 + 1/3 + ... + 1/n
public class bai13 {
    public static void main(String[] args) {
        System.out.print("Nhap so tu nhien n:  ");
        int n = new Scanner(System.in).nextInt();

        if(n > 0){
            System.out.println("Tong la:  "+sum(n));
        }
    }

    public static double sum(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += 1.0 / i;
        }
        return sum;
    }
}
