package bai5;

//Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau.
//Hãy nhập một số và kiểm tra xem số đó có phải số thuật nghịch hay không (ví dụ số: 558855).

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {

        System.out.println("Nhap so can kiem tra:  ");
        int n = new Scanner(System.in).nextInt();
        int a = n;
        int b = 0;
        while(n > 0){
            int z = n % 10;
            b = b * 10 + z;
            n/= 10;

        }
        if(b == a){
            System.out.println("la so thuan nghich");
        }else{
            System.out.println("khong la so thuan nghich");
        }
    }
}
