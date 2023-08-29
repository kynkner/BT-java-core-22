package bai5;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của ký tự đó trong chuỗi vừa nhập.
//b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế bằng s2. Xuất s ra màn hình
// Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =“123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”.
public class bai5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //a---------------------a---------------a------------------a
        System.out.println("Nhap chuoi ki tu:");
        String st = sc.nextLine();
        System.out.println("Nhap ki tu can tim:");
        String st1 = sc.nextLine();

        System.out.println("ki tu dau tien:   "+st.indexOf(st1));
        System.out.println("ki tu cuoi cung:   "+st.lastIndexOf(st1));

        //b-------------------------b---------------b-----------b----------------b
        System.out.println("--------------------------------------");
        System.out.println("nhap 3 xau ky tu s, s1, s2:");

        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(s.replace(s1, s2));
    }
}
