package bai7;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Arrays;
import java.util.Scanner;

//Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
// Nếu nhập một số đã có thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
public class bai7 {
    public static void main(String[] args) {
        System.out.println("Nhap so luong mang:  ");
        int n = new Scanner(System.in).nextInt();

        int[] a = inputArray(n);

        System.out.println(Arrays.toString(a));
    }

    public static int[] inputArray(int n) {
        int[] array = new int[n];
        int number = 0;

        while(number < array.length){
            System.out.print("a["+number+"] = ");
            int element = new Scanner(System.in).nextInt();
            if(kiemTra(array, number, element)){
                System.out.print("So da ton tai nhap lai ");
            }else{
                array[number] = element;
                number++;
            }
        }
            return array;
    }
    public static boolean kiemTra(int[] a, int number, int element) {
        for (int i = 0; i < number; i++) {
            if(a[i] == element){
                return true;
            }
        }
        return false;
    }
}
