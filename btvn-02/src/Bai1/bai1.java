package Bai1;

import java.util.Scanner;

//Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a khác 0.
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a va b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a != 0) ? ("Phuong trinh co nghiem la:   "+(-b/a)) : ("vo nghiem"));
    }
}
