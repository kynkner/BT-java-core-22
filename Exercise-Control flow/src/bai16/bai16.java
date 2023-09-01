package bai16;

//Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không. (Hai số nguyên tố cùng nhau là 2 số có UCLN là 1).

import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {

        System.out.print("Nhap so tu nhien n:  ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Nhap so tu nhien m:  ");
        int m = new Scanner(System.in).nextInt();

        int ucln = 0;
        while(m != 0){
            ucln = m;
            m = n % m;
            n = ucln;
        }
        if(ucln == 1){
            System.out.println("la 2 so nguyen to cung nhau");
        }else{
            System.out.println("khong la 2 so nguyen to cung nhau");
        }

    }
}
