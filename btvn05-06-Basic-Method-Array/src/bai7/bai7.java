package bai7;

import java.util.Arrays;
import java.util.Scanner;

//Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
// Nếu nhập một số đã có thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
public class bai7 {
    public static void main(String[] args) {
        System.out.println("Nhap so luong mang:  ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        boolean srceen = daySoDaNhap(a, n);
            if(srceen){
                System.out.println(srceen);
            }
        System.out.println("Dãy số đã nhập:");
        for (int number : a) {
            System.out.print(number + " ");
        }
    }

    public static boolean daySoDaNhap(int []a, int n ) {

            for(int i = 0; i < n; i++){
                if(a[i] == a[n - 1 -i]){
                    System.out.println("Nhap lai so thu "+(i + 1)+" :  ");
                    int number = new Scanner(System.in).nextInt();
                    if(number == a[i]){
                        System.out.println("so da co");

                    }
                }
            }
            return true;
    }
}
