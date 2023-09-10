package bai17;

//Thực hiện nhập vào hai ma trận số nguyên a, b có n dòng và m cột (n, m>0). Thực hiện tính tổng hai ma trận này.

import java.util.Arrays;
import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        int[][] a = inputMatix();
        System.out.println(sum(a));
    }

    public static int[][] inputMatix() {
        System.out.print("Nhap so luong mang cua dong:  ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap so luong mang cua dong:  ");
        int m = new Scanner(System.in).nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
            System.out.println();
        }
        return a;
    }

    public static int sum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                    sum += a[i][j];
            }
        }
        return sum;
    }

}
