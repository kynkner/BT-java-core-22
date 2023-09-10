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
        int solonthu2 = maxThu2(a);
        int location = vitri(a, maxThu2(a));
        if(solonthu2 != -1){
            System.out.println("So lon thu 2 la: "+solonthu2);
            System.out.println("Vi tri so lon thu 2 la: "+location);
            return;
        }
        System.out.println("khong co so lon thu hai");
    }

    public static int maxThu2(int[] a) {
        int max1 = a[0];
        int max2 = a[0];
        int location = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            }
            if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
            if(max2 == max1){
               max2 = -1;
            }
        }
        return max2;
    }

    public static int vitri(int[] a, int max) {
        int number = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == max){
                a[number] = i;
                number = a[number];
            }
        }
        return number;
    }
}
