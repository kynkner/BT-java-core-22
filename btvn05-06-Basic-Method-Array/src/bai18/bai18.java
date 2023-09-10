package bai18;

//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0). Thực hiện sắp xếp mảng theo thứ tự giảm dần.

import java.util.Arrays;
import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        int[] a = inputArray();
        System.out.println(Arrays.toString(arange(a)));
    }

    public static int[] inputArray() {
        System.out.println("Nhap so luong mang:  ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int[] arange(int[] a) {
            for(int i = 0; i < a.length - 1; i++){
                for (int j = i; j < a.length; j++) {
                    if(a[i] < a[j]){
                        int number = a[i];
                        a[i] = a[j];
                        a[j] = number;
                    }
                }
            }
        return  a;
    }
}
