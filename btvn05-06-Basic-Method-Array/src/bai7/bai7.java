package bai7;

import java.util.Arrays;
import java.util.Scanner;

//Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
// Nếu nhập một số đã có thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
public class bai7 {
    public static void main(String[] args) {
        int[] array = inputArray();

        daySo(array);


    }

    public static int[] inputArray() {
        System.out.println("Nhap so luong mang:  ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void daySo(int[] array) {
        int number = 0;
        while(number < array.length){
            int element = new Scanner(System.in).nextInt();
            if(kiemTra(array, number, element)){
                array[number] = element;
                number++;
            } else {
                System.out.println("Số đã tồn tại trong dãy. Hãy nhập lại.");
            }
        }
    }
    public static boolean kiemTra(int[] array, int number, int element  ) {
        for (int i = 0; i < number; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}
