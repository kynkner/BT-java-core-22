package entity;

import statics.Specialized;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Book {
    public static int auto_id = 10000;
    private int Id; // ma sach
    private String bookTitle;   //ten sach
    private String Author;  //ten tac gia
    private Specialized specialized; //chuyen nganh
    private int publishingYear;//nam xuat ban
    public Book(){
        this.Id = auto_id;
        auto_id++;
    }
    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", bookTitle='" + bookTitle + '\'' +
                ", Author='" + Author + '\'' +
                ", specialized=" + specialized.value +
                ", publishingYear=" + publishingYear +
                '}';
    }

    public void setId(int id) {
        Id = id;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setSpecialized(Specialized specialized) {
        this.specialized = specialized;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getId() {
        return Id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public Specialized getSpecialized() {
        return specialized;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
    public void inputInfo(){
        System.out.print("Nhap ten sach: ");
        this.setBookTitle(new Scanner(System.in).nextLine());
        System.out.print("Nhap ten tac gia: ");
        this.setAuthor(new Scanner(System.in).nextLine());
        System.out.print("Nhap chuyen nganh: ");

        System.out.println("Chon 1 trong cac chuyen nganh sau; ");
        System.out.println("1. Khoa hoc tu nhien");
        System.out.println("2. Van hoc- Nghe thuat");
        System.out.println("3. Dien tu vien thong");
        System.out.println("4. Cong nghe thong tin");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setSpecialized(Specialized.NaturalSciences);
                break;
            case 2:
                this.setSpecialized(Specialized.LiteratureArts);
                break;
            case 3:
                this.setSpecialized(Specialized.ElectronicsandTelecommunication);
                break;
            case 4:
                this.setSpecialized(Specialized.Informationtechnology);
                break;

        }
        System.out.print("Nhap nam xuat ban: ");
        this.setPublishingYear(new Scanner(System.in).nextInt());
    }
    public void showBooks(){
        System.out.print(" Ma sach: "+Id);
        System.out.print(", Ten sach: "+bookTitle);
        System.out.print(", Ten tac gia: "+Author);
        System.out.print(", Chuyen nganh: "+specialized.value);
        System.out.print(", Nam xuat ban: "+publishingYear);
    }
}
