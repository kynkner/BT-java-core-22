package bai21;

import java.util.Scanner;

/**Thực hiện nhập vào h ai mảng số nguyên a,b đều có n phần tử (n>0).
 *Thực hiện tính tổng hai mảng này theo quy tắc:
 * phần tử đầu của a sẽ được cộng với phần tử cuối của b để cho ra phần tử đầu của mảng kết quả,
 * tiếp theo phần tử thứ 2 của a và phần tử gần cuối của b được cộng vào để cho ra phần tử thứ 2 của mảng kết quả,
 * …*/
public class bai21 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Nhap phan tu mang a:  ");
        intputMatrix(a);
        System.out.println("phan tu b");
        intputMatrix(b);
    }

    public static void intputMatrix(int[] a) {
        for(int i = 0; i < a.length; i++){
            System.out.println("["+i+"] :");
            a[i] = new Scanner(System.in).nextInt();
        }
    }
}
