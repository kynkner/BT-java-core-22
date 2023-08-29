package bai3;

import java.time.chrono.ThaiBuddhistEra;
import java.util.Scanner;

//Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình chữ nhật đó.
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu rong va chieu cao hinh chu nhat:");
        int width = sc.nextInt();
        int height = sc.nextInt();

        int P = (width + height) * 2;
        System.out.println("Chu vi hinh chu nhat la:"+ P);


        System.out.println("Dien tich hinh chu nhat la:"+ (width * height));


    }
}
