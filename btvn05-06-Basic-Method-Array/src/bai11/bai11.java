package bai11;

//Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0). Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong mang cua dong:  ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap so luong mang cua cot:  ");
        int m = new Scanner(System.in).nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        maxMin(a, m, n);
    }
    public static void maxMin(int[][] a, int m, int n) {
        int max = a[0][0];
        int min = a[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(a[i][j] > max){
                    max = a[i][j];
                }
                if(a[i][j] < min){
                    min = a[i][j];
                }

            }
        }
        System.out.println("So lon nhat la:  "+max);
        System.out.println("So be nhat la:  "+min);
    }
}
