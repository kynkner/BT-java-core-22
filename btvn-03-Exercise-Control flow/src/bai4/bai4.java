package bai4;

//Viết chương trình liệt kê n số nguyên tố đầu tiên.

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {

        System.out.println("Nhap so n:");
        int n = new Scanner(System.in).nextInt();
        int z = 0;
        int j = 2;
        System.out.print(n+" So nguyen to dau tien:   ");

        while(z < n){
            boolean Songuyento = true;
            for(int i = 2; i < Math.sqrt(n); i++) {
                if(j % i == 0){
                    Songuyento = false;
                    break;
                }
            }
            if(Songuyento){
                System.out.print(j+" ");
                z++;
            }
            j++;
        }

        }
    }



