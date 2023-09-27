package bai5;

import java.util.Arrays;
import java.util.Scanner;

//Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc: họ…đệm…tên;
// chuyển xâu đó sang biểu diễn theo cấu trúc tên…họ…đệm.
public class bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập họ tên theo cấu trúc(họ…đệm…tên): ");
        String fullName = new Scanner(System.in).nextLine();

        String[] cupfullName = fullName.split("\\.+");
        System.out.println(Arrays.toString(cupfullName));

        if(cupfullName.length >= 2){
            String Surname = cupfullName[0];
            String Name = cupfullName[cupfullName.length - 1];

            StringBuilder NewFullName = new StringBuilder();
            NewFullName.append(Name);

            for (int i = 1; i < cupfullName.length - 1; i++) {
                NewFullName.append("...");
                NewFullName.append(cupfullName[i]);
            }
            NewFullName.append("...");
            NewFullName.append(Surname);

            System.out.println("Ket qua sau khi chuyen doi: "+NewFullName);
            return;
        }
        System.out.println("Xau ky tu khong hop le");
    }
}
