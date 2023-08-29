//Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân.
public class bai5 {
    public static void main(String[] args) {
        System.out.println("Nhap 2 so nguyen duong a, b");
        int a = 4;
        int b = 7;

        double kq = 1.0 * a / b ;
        System.out.printf("Ket qua lam tron: %1.3f", kq);
    }
}
