package bai11;

import java.util.Scanner;

/** Nhập số tự nhiên n rồi tính các tổng sau:
 • S = tổng các số tự nhiên không lớn hơn n.
 • S1 = tổng các số tự nhiên lẻ không lớn hơn n.
 • S2 = tổng các số tự nhiên chẵn không lớn hơn n.
 */

public class bai11 {
    public static void main(String[] args) {

        System.out.print("Nhap so tu nhien n:  ");
        int n = new Scanner(System.in).nextInt();

        int S = 0;
        int S1 = 0;
        int S2 = 0;

        for(int i = 1; i <= n; i++){
            S+=i;
            if(i % 2 == 0){
                S2+=i;
            }else{
                S1+=i;
            }
        }
        System.out.println("Tong cac so tu nhien khong lon hon n la:   "+S);
        System.out.println("Tong cac so tu nhien le khong lon hon n la:   "+S1);
        System.out.println("Tong cac so tu nhien chan khong lon hon n la:   "+S2);
    }
}
