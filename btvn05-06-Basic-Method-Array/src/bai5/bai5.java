package bai5;

import java.util.Scanner;

/**Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c (b < c).
 * Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].*/
public class bai5 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong mang:   ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Nhap doan [b, c] can tinh:   ");
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        if(average(a, b, c) > 0){
            System.out.println("Trung cong cua day trong doan [b ,c] la:   "+average(a, b, c));
        }else {
            System.out.println("khong co ket qua");
        }
    }

    public static double average(int[] a, int b, int c) {
            double sum = 0;
            int cout = 0;
            for(int i = b; i <= c; i++){
                 if(i >= 0 && c < a.length){
                     sum+= a[i];
                     cout++;
                 }
            }
                return sum / cout ;
    }
}
