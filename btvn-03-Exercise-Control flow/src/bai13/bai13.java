package bai13;

//tinh giai thua

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {

        System.out.print("Nhap so tu nhien n:   ");
            int n = new Scanner(System.in).nextInt();

            double kQ = 0;

            for (int i = 1; i <= n; i++) {
             kQ += 1.0 / i;
        }
        System.out.print("Tong cua day so là:  "+kQ);
    }
}
