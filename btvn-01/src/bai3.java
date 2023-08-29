

// Tìm số lớn nhất trong 4 số biết trước
public class bai3 {
    public static void main(String[] args) {


        System.out.println("Nhap bon so nguyen duong:");
        int a = 5;
        int b = 8;
        int c = 20;
        int d = 11;

       if(a > b && a > c && a > d){
           System.out.printf("So lon nhat la:"+ a);
       }else if(b > c && b > d){
           System.out.println("So lon nhat la:"+ b);
       }else if( c > d){
           System.out.println("So lon nhat la:"+ c);
       }else {
           System.out.println("So lon nhat la:"+ d);
       }
    }
}
