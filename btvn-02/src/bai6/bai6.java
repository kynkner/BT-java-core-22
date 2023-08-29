package bai6;

import java.util.Scanner;

//Sử dung kiến thức ép kiểu dữ liệu để giải bài toán tính sin và cos của 1 góc trong tam giác vuông khi biết độ dài 3 cạnh
// (với độ chính xác lấy tới 2 chữ số thập phân).
public class bai6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhap 3 canh cua tam giac vuong huyen doi ke:");
        System.out.print("Nhap canh huyen:   ");
        double H = sc.nextDouble();
        System.out.print("Nhap canh doi:   ");
        double D = sc.nextDouble();
        System.out.print("Nhap canh ke:   ");
        double K = sc.nextDouble();

        double sin = D / H;
        System.out.println("Gia tri cua Sin:   "+(double)Math.round(sin * 100) / 100 );

        System.out.println("Gia tri cua Cos:   "+(double)Math.round(( K / H) * 100) / 100);
    }
}
