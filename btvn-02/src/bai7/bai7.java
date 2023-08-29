package bai7;

import java.util.Scanner;

//Nhập vào bán kính hình tròn,
// tính chu vi và diện tích của hình tròn đó với kết quả được làm tròn tới 3 chữ số thập phân.
public class bai7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhap ban r duong tron:   ");
        double r = sc.nextDouble();

        double P = 2 * r * Math.PI;
        System.out.println("Chu vi hinh tron la:   "+ (double)Math.round(P * 1000) / 1000);

        double S = Math.pow(r, 2) * Math.PI;
        System.out.println("Dien tich hinh tron la;   "+ (double)Math.round(S * 1000) / 1000);

    }
}
