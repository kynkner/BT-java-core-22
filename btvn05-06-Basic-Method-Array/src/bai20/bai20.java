package bai20;

//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x. Đếm số lần xuất hiện của x trong mảng a

import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        int[] a = inputArray();
        System.out.println("Nhap so can dem:  ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("So lan "+x+" xuat hien trong mang la: "+dem(a, x));
    }
    public static int[] inputArray() {
        System.out.print("Nhap so luong mang:  ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int dem(int[] a, int x) {
        int number = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x){
                number++;
            }
        }
        return number;
    }
}
