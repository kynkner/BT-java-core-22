package bai14;

import java.util.Scanner;

//Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
public class bai14 {
    public static void main(String[] args) {
        System.out.print("Nhap so tu nhien n:  ");
        int n = new Scanner(System.in).nextInt();

        soChan(n);
        soLe(n);
    }

    public static void soChan(int n) {
        System.out.print("Cac so chan hon "+n+" la:  ");
        for(int i = 0; i < n; i+=2 ){
                System.out.print(i+" ");
            }
        System.out.println();
    }

    public static void soLe(int n) {
        System.out.print("Cac so le hon "+n+" la:  ");
        for(int i = 1; i < n; i+=2 ){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
