package bai12;

//Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0). Tính tổng đường chéo chính của ma trận này.

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong mang cua dong:  ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        sumCheo(a, n);
    }

    public static void sumCheo(int[][] a, int n ) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
                sum += a[i][i];
            }

        System.out.println("Tong duong cheo chinh cua ma tran la:  "+sum);
    }
}
