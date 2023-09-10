package bai3;

import java.util.Arrays;
import java.util.Scanner;

/**Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1].
 * Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy trên
 * (tức là đếm số cặp a[i], a[i+1] sao cho a[i] = a[i+1];
 * nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).*/
public class bai3 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong cua mang:  ");
        int n = new Scanner(System.in).nextInt();
        int [] a = new int[n];
        System.out.println("Nhap phan tu trong mang:   ");
        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Co "+bangNhau(a, n)+" cap hai phan tu lien tiep bang nhau trong day");
    }

    public static int bangNhau(int[] a, int n) {
        int cout = 0;
        for(int i = 0; i < n - 1; i++){
            if(a[i] == a[i + 1]){
                cout++;
            }
        }
        return cout;
    }
}
