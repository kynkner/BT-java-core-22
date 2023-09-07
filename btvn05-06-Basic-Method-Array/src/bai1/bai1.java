package bai1;
/**Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số
 * thoả mãn tất cả các điều kiện sau cùng lúc:
 a) Là số thuận nghịch.
 b) Chỉ có chữ số 0, 6, 8
 c) Tổng chữ số chia hết cho 10*/
public class bai1 {
    public static void main(String[] args) {
        for(int i = 1000000; i <= 1000000000; i++){
            if(soThuanNghich(i) && chuSo(i) && chiaHet(i)){
                System.out.println(i);
            }
        }
    }
        //la so thuan nghich hay khong
    public static boolean soThuanNghich(long number) {
        long number1 = number;
        long number2 = 0;
        while(number > 0){
            number2 = (number2 * 10) + (number % 10);
            number /= 10;
        }
        return  number1 == number2;
    }
        // chi la cac chuu co 0, 6, 8
    public static boolean chuSo(long number) {
        while(number > 0){
            long digit = number % 10;
            if(digit != 0 && digit != 6 && digit !=8){
                    return false;
            }
            number /= 10;
        }
        return true;
    }
    //tong cac chu so chia het cho 10
    public static boolean chiaHet(long number) {
        long sum = 0;
        while(number > 0){
            sum = sum + (number % 10);
            number /= 10;
        }
        return  sum % 10 == 0;
    }
}
