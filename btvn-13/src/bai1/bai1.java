package bai1;

// Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch. Áp dụng liệt kê các số thuận nghịch có 6 chữ số.

public class bai1 {
    public static void main(String[] args) {
        ReversibleNUmber();
    }

    private static void ReversibleNUmber() {
        for (int i = 100000; i < 1000000; i++) {
            if(CheckReversibleNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean CheckReversibleNumber(int i) {
        int number1 = i;
        int number2 = 0;

        while (i > 0){
            int digit = i % 10;
            number2 = number2 * 10 + digit;
            i /= 10;
        }
            return number1 == number2;
    }
}
