package bai8;

//Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp n x k.

import java.util.Scanner;

public class bai8 {
    /**
    public static void main(String[] args) {
        System.out.println("Nhap so luong mảng: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap so luong mảng: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap so luong mảng: ");
        int k = new Scanner(System.in).nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[n][k];

        inputArray(A);
        inputArray(B);

        int[][] kQ = tinhTichMaTran(A, B);
        inMaTran(kQ);
    }

    public static void inputArray(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
            System.out.println();
        }
    }
    public static int[][] tinhTichMaTran(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int k = B[0].length;
        int[][] result = new int[m][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int x = 0; x < n; x++) {
                    result[i][j] += A[i][x] * B[x][j];
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

*/
}
