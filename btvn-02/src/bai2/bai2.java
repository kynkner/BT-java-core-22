package bai2;

import java.util.Scanner;

//Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn phím, a khác 0.
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap 3 so a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x = Math.pow(b, 2) - (4 * a * c);
        int y = 0;

        double delta = (a != 0) ? (x) : (y);

        System.out.println((delta < 0) ? "phuong trinh vo nghiem":"");

        System.out.println((delta == 0)  ? ("huong trinh co 2 nghiem kep:"+(- b / (2 * a))) : "");


        double nghiem1 = (-b + Math.sqrt(delta) / ( 2 *a));
        double nghiem2 = (-b - Math.sqrt(delta) / ( 2 *a));
        System.out.println((delta > 0) ? "Phuong trinh co 2 nghiem phan biet:" : "");
        System.out.println((delta > 0) ? ("Nghiem 1:   "+nghiem1) : "");
        System.out.println((delta > 0) ? ("Nghiem 2:   "+nghiem2) : "");

    }
}
