package bai9;

//Chèn chuỗi S1 vào chuỗi S2 ở vị trí k biết trước với S1, S2 và k nhập vào từ bàn phím.

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        System.out.print("Nhap chuoi S1: ");
        String S1 = new Scanner(System.in).nextLine();

        System.out.print("Nhap chuoi S2: ");
        String S2 = new Scanner(System.in).nextLine();

        System.out.print("Nhap vi tri k: ");
        int k  = new Scanner(System.in).nextInt();

        if(k < 0 || k > S2.length()){
            System.out.println("Vi tri khong hop le");
            return;
        }
        StringBuilder NewSS = new StringBuilder(S2);

        NewSS.insert(k, S1);
        System.out.println("Chuoi moi: "+NewSS);
    }
}
