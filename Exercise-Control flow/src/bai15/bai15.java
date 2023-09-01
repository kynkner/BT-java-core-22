package bai15;

//hập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {

        System.out.print("Nhap so tu nhien n:  ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Cac so chan nho hon n la:   ");
        for(int i = 0; i <= n; i+=2){
            System.out.print(i+" ");
        }
        System.out.print("\nCac so le nho hon n la:   ");
        for(int i = 1; i <= n; i+=2){
            System.out.print(i+" ");
        }
    }
}
