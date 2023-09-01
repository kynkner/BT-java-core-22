package bai12;

//tinh so Pi

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {

        System.out.print("Nhap so tu nhien c:   ");
        double c = new Scanner(System.in).nextDouble();

        if (c > 0) {
            double Pi = 0;
            int n = 1;
            boolean x = true;

            while (1.0 / (2 * n - 1) >= c) {
                if (x) {
                    Pi += 1.0 / (2 * n - 1);
                } else {
                    Pi -= 1.0 / (2 * n - 1);
                }
                x = !x;
                n++;
            }

            Pi *= 4;

            System.out.println("Giá trị của Pi la:  " + Pi);
        } else {
            System.out.println("Nhập số c > 0.");
        }
    }
}
