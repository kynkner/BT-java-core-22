package bai2;

//Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        System.out.println("Nhap so tu nhien n:");
        int n = new Scanner(System.in).nextInt();
            int z = 0;

        System.out.print("Cac uoc so cua "+n+" la: ");
            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    System.out.printf(" " +i);
                    z++;
                }
            }
        System.out.println("\nCo "+z+" uoc");

    }
}
