package bai8;

//Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật rỗng các dấu * kích thước n*m. Ví dụ với n=5, m=4:

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {


        System.out.print("Nhập chiều dài n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập chiều rộng m: ");
        int m = new Scanner(System.in).nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == m - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
