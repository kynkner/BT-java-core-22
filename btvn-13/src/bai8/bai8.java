package bai8;

//Tìm kiếm vị trí xuất hiện đầu tiên của chuỗi S1 trong S2. Nếu không tìm thấy trả về -1.

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        System.out.print("Nhap tu muon tim: ");
        String S1 = new Scanner(System.in).nextLine();
        String S2 = "thứ sáu tuần này là trung thu";

        int index = S2.indexOf(S1);

        if (index != -1){
            System.out.println("Vi tri xuat hien dau tien chuoi S1 trong S2: "+(index + 1));
            return;
        }
        System.out.println("-1");
    }
}
