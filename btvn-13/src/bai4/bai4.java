package bai4;

import java.util.Scanner;

// Viết chương trình thực hiện nhập một xâu ký tự và tìm từ dài nhất trong xâu đó.
// Từ đó xuất hiện ở vị trí nào? (Chú ý. nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm thấy).
public class bai4 {
    public static void main(String[] args) {
        System.out.print("Nhap mot xau ky tu: ");
        String arrays = new Scanner(System.in).nextLine();

        String[] spaces = arrays.split(" ");

        int longSpaceIndex = spaceindex(spaces);

        result(longSpaceIndex, spaces);
    }

    private static void result(int longSpaceIndex, String[] spaces) {
        if(longSpaceIndex != -1){
            System.out.println("Tu dai nhat la: "+spaces[longSpaceIndex]);
            System.out.println("Vi tri tu dai nhat la: "+(longSpaceIndex + 1));
            return;
        }
        System.out.println("Khong co tu trong xau ky tu");
    }

    private static int spaceindex(String[] spaces) {
        String longSapce = "";
        int longSpaceIndex = -1;
        for (int i = 0; i < spaces.length; i++) {
            String space = spaces[i];
            if (space.length() > longSapce.length()){
                longSapce = space;
                longSpaceIndex = i;
            }
        }
        return longSpaceIndex;

    }


}
