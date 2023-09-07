package bai16;

/**Viết chương trình liệt kê các số nguyên có từ 5 đến 7 chữ số thoả mãn tất cả các điều kiện sau cùng lúc:
 a) Là số nguyên tố.
 b) Là số thuận nghịch.
 c) Không chứa chữ số 4*/
public class bai16 {
    public static void main(String[] args) {
        for(int i = 10000; i < 10000000; i++){
            if(soNgTo(i) && soThuanNghich(i) && khong4(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean soNgTo(int number) {
        if(number < 2){
            return  false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean soThuanNghich(int number) {
        int number1 = number;
        int number2 = 0;
        while(number > 0){
            number2 = (number2 * 10) + (number % 10);
            number /= 10;
        }
        return  number1 == number2;
    }

    public static boolean khong4(int number) {
        while(number > 0){
            int digit = number % 10;
            if(digit ==4){
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
