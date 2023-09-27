package bai2;

//viết chương trình nhập vào một xâu ký tự s bất kỳ, sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ in thường.
// Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
       String s = checkS();
        String result = convertinput(s);
        System.out.println("Kết quả sau khi chuyển đồi là: "+result);
    }

    private static String checkS() {
        String s;
        boolean value;
        do {
            System.out.print("Nhập một xâu ký tự: ");
            s = new Scanner(System.in).nextLine();

            value = valuecheck(s);
            if(!value){
                System.out.println("Không có chữ cái trong xâu ký tư, vui lòng nhập lại");
            }
        }while (!value);
        return s;
    }

    private static boolean valuecheck(String s) {
        for ( char c : s.toCharArray()){
            if(Character.isLetter(c)){
                return true;
            }
        }
            return false;
    }

    private static String convertinput(String s) {
            char[] chars = s.toCharArray();
            StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            char  characters = chars[i];
            if (i % 2 == 0){
                result.append(Character.toUpperCase(characters));
            }else {
                result.append(Character.toLowerCase(characters));
            }
        }
            return  result.toString();
    }
}
