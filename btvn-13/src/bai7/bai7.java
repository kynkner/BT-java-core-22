package bai7;

import java.util.Scanner;

//Nhập hai xâu S1 và S2. Tìm xâu S2 trong S1. Nếu có hãy loại bỏ S2 trong S1.
// Chú ý: phải loại bỏ cho đến khi không tìm được S2 trong S1 nữa.
public class bai7 {
    public static void main(String[] args) {
        System.out.print("Nhập xâu S1: ");
        String S1 = new Scanner(System.in).nextLine();

        System.out.print("Nhập xâu S2: ");
        String S2 = new Scanner(System.in).nextLine();

        while (S1.contains(S2)){
            S1 = S1.replaceFirst(S2," ");
        }
        System.out.println(S1);
    }
}
