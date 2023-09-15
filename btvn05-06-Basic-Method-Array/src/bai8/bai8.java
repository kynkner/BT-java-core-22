package bai8;

//Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp n x k.

import java.util.Scanner;

public class bai8 {

    public static void main(String[] args) {
        System.out.println("Nhap so luong mảng: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap so luong mảng: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap so luong mảng: ");
        int k = new Scanner(System.in).nextInt();

        int[][] A = inputArray(m, n);
        int[][] B = inputArray(n, k);

        int[][] kQ = tinhTichMaTran(A, B);
        inMaTran(kQ);
    }

    public static int[][] inputArray(int m, int n ) {
        int[][] a = new int[m][n];

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
            System.out.println();
        }
        return  a;
    }
    public static int[][] tinhTichMaTran(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (int x = 0; x < B[0].length; x++) {
                    result[i][x] += A[i][j] * B[j][x];
                }
            }
        }
        return result;
    }
    public static void inMaTran(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
