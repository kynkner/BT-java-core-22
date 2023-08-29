package bai4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định (nhập chuỗi),
// tính tuổi của người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).
    public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ngay thang nam sinh cua ban (dd/mm/yyyy):   ");
        String birthDate = sc.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 =      LocalDate.parse(birthDate, dateTimeFormatter);
        LocalDate localDate2 =      LocalDate.now();

        int date1 = localDate1.getYear();
        int date2 = localDate2.getYear();


        System.out.println("So tuoi hien tai cua ban:  "+(date2 - date1)+"  tuoi");


    }
}
