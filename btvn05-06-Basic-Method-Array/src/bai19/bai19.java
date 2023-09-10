package bai19;

//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0). Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.

import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
            int[] a = inputArray();
            int[] sum = chanLe(a);
            int chan = sum[0];
            int le = sum[1];
        System.out.println("Co "+chan+" so chan");
        System.out.println("Co "+le+" so le");
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

    public static int[] chanLe(int[] a) {
        int chan = 0;
        int le = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                chan++;
            }else{
                le++;
            }
        }
        int[] array = {chan, le};
        return  array;
    }
}
