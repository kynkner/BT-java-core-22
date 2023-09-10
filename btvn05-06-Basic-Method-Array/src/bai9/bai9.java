package bai9;

//Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).

public class bai9 {
    public static void main(String[] args) {
        for(int i = 100000; i < 1000000; i++){
            if(soThuanNghich(i) && chiaHet(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean soThuanNghich(int number) {
        int number1 = number;
        int number2 =0;
        while(number > 0){
            number2 = (number2 * 10) + (number % 10);
            number /= 10;
        }
        return number1 == number2;
    }

    public static boolean chiaHet(int number) {
        int sum = 0;
        while(number > 0){
            sum = sum + number % 10;
            number/= 10;
        }
        return sum % 10 == 0;
    }
}
