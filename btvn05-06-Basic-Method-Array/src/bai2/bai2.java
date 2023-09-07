package bai2;
/**Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn tất cả các điều kiện sau cùng lúc:
 a) Là số nguyên tố.
 b) Tất cả các chữ số là nguyên tố
 c) Đảo của nó cũng là một số nguyên tố*/
public class bai2 {
    public static void main(String[] args) {
        for(int i = 1000000; i < 10000000; i++){
            if(soNgTo(i) && allSoNgTo(i)){
                if(allSoNgTo(daoSoNgTo(i))){
                    System.out.println(i);
                }
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

    public static boolean allSoNgTo(int number) {
        while(number != 0){
            int digit = number % 10;
            if(!soNgTo(digit)){
                return  false;
            }
            number/= 10;
        }
        return true;
    }

    public static int daoSoNgTo(int number) {
        int number1 = 0;
        while (number > 0) {
            number1 = (number1 * 10) + (number % 10);
            number /= 10;
        }
        return number1;
    }

}
