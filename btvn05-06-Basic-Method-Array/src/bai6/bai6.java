package bai6;

import java.util.Scanner;

/**Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
 * Kiểm tra xem a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).*/
public class bai6 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong mang:  ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        if(doiXung(a)){
            System.out.println("La mang doi xung");
            return;
        }
        System.out.println("khong la mang doi xung");
    }

    public static boolean doiXung(int[] a) {
            int n = a.length;
            for(int i = 0; i < n / 2; i++){
                if(a[i] != a[n - 1 - i]){
                    return false;
                }
            }
            return true;
    }
}
