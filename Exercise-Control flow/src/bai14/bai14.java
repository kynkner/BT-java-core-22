package bai14;

//Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {

        System.out.print("Nhap so tu nhien n:   ");
        int n = new Scanner(System.in).nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 7 == 0){
                sum+=i;
            }
        }
        System.out.println("Tong so cac tu nhien khong lon hon "+n+" va chia het cho 7 la:  "+sum);
    }
}
