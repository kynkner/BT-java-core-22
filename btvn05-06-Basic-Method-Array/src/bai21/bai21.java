package bai21;

import java.util.Arrays;
import java.util.Scanner;

/**Thực hiện nhập vào hai mảng số nguyên a,b đều có n phần tử (n>0).
 *Thực hiện tính tổng hai mảng này theo quy tắc:
 * phần tử đầu của a sẽ được cộng với phần tử cuối của b để cho ra phần tử đầu của mảng kết quả,
 * tiếp theo phần tử thứ 2 của a và phần tử gần cuối của b được cộng vào để cho ra phần tử thứ 2 của mảng kết quả,
 * …*/
public class bai21 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = intputArray(n);
        System.out.println();
        int[] b = intputArray(n);

        System.out.println(Arrays.toString(sumArray(a, b)));
    }

    public static int[] intputArray(int n) {
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            System.out.print("["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int[] sumArray(int[] a, int[] b) {
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[a.length - 1 - i];
        }
        return sum;
    }
}
