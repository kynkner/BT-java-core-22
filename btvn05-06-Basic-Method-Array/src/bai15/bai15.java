package bai15;

import java.util.Scanner;

//Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không. (Hai số nguyên tố cùng nhau là 2 số có UCLN là 1).
public class bai15 {
    public static void main(String[] args) {
        System.out.print("Nhap so tu nhien m:   ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhap so tu nhien n:   ");
        int n = new Scanner(System.in).nextInt();

        if(ucln(m, n) == 1){
            System.out.println("Nguyen to cung nhau");
            return;
        }
            System.out.println("khong phai la nguyen to cung nhau");
    }

    public static int ucln(int m, int n) {
          while(n != 0){
              int number = n;
              n = m % n;
              m = number;
          }
          return m;
    }
}
