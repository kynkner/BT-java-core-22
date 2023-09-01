package bai6;


//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4=32

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {

        System.out.println("Nhap so nguyen bat ki:");
        int n = new Scanner(System.in).nextInt();

        int sum = 0;
        int z = 0;
        System.out.print("Tong cua day so "+n+" la:  ");
        while(n > 0){
            z = n % 10;
            sum += z;
            n/= 10;
            System.out.print(z+"+");

        }
        System.out.print("="+sum);

    }
}
