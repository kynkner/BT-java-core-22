package bai4;
/**Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1].
 * Tìm số lớn thứ hai và vị trí của nó trong dãy.
 * Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.*/
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong mang:   ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        int[] result = maxThu2(a);
        if(result[0] != -1){
            System.out.println("So lon thu 2 la: "+result[0]);
            System.out.println("Vi tri so lon thu 2 la: "+result[1]);
        }
        System.out.println("khong co so lon thu hai");
    }

    public static int[] maxThu2(int[] a) {
        int max1 = a[0];
        int max2 = Integer.MIN_VALUE;
        int max2Index = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
                max2Index = i - 1;
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
                max2Index = i;
            }
        }

        int[] result = { -1, -1 };

        if (max2Index != -1) {
            result[0] = max2;
            result[1] = max2Index;
        }

        return result;
    }
}
