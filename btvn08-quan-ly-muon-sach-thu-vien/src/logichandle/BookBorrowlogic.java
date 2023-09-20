package logichandle;

import entity.Book;
import entity.BookBorrowManagement;
import entity.BookBorrowManagementDetail;
import entity.Reader;

import java.util.Scanner;

public class BookBorrowlogic {
    private Booklogic booklogic;
    private readerlogic readerlogic;
    private  BookBorrowManagement[] bookBorrowManagements = new BookBorrowManagement[100];

    public BookBorrowlogic(Booklogic booklogic, logichandle.readerlogic readerlogic) {
        this.booklogic = booklogic;
        this.readerlogic = readerlogic;
    }

    public BookBorrowManagement[] getBookBorrowManagements() {
        return bookBorrowManagements;
    }

    void showBorrow() {
        for (int i = 0; i < bookBorrowManagements.length; i++) {
            if(bookBorrowManagements[i] != null){
                System.out.print(bookBorrowManagements[i]);
            }
        }
    }

    void borrowBook() {
        System.out.println("Co bao nhieu ban doc can muon sach");
        int readerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNumber; i++) {
            System.out.println("Nhap thong tin ban doc thu"+(i+1));
            Reader reader = inputReaderForBorrow();

            BookBorrowManagementDetail[] details = intputBookManagementDetail();

            BookBorrowManagement bookBorrowManagement = new BookBorrowManagement(reader, details);
            saveBorrow(bookBorrowManagement);
        }
    }

    private  BookBorrowManagementDetail[] intputBookManagementDetail() {
        System.out.println("Ban doc muon muon bao nhieu dau sach");
        int bookNumber;
        do {
            bookNumber = new Scanner(System.in).nextInt();
            if(bookNumber > 0 && bookNumber < 6){
                break;
            }
            System.out.println("So luong dau sach la mot so duong nho hon 6, vui long nhap lai: ");
        }while (true);
        BookBorrowManagementDetail[] details = new BookBorrowManagementDetail[bookNumber];
        int count = 0;
        for (int j = 0; j < bookNumber; j++) {
            System.out.println("Nhap thong tin cho dau sach thu"+(j+1));
            System.out.println("Nhap id cua sach");
            int bookId;
            Book book = null;
            // tim sach
            do {
                bookId = new Scanner(System.in).nextInt();
                book = booklogic.searchBookById(bookId);
                if(book == null){
                    System.out.println("Khong ton tai sach mang ma"+bookId+", vui long nhap lai: ");
                }
            }while (book != null);

            System.out.println("ban muon muon dau sach"+book.getBookTitle()+"bao nhieu cuon: ");
            int quantity ;
            do {
                quantity = new Scanner(System.in).nextInt();
                if(quantity > 0 && quantity < 4){
                    break;
                }
                System.out.println("So luong cuon sach la so nguyen va nho hon 4 vui long nhap lai: ");
            }while (true);
            BookBorrowManagementDetail detail = new BookBorrowManagementDetail(book, quantity);
            details[count] = detail;
            count++;
        }
        return details;
    }

    private  Reader inputReaderForBorrow() {
        System.out.println("Nhap ma ban doc muon muon sach");
        int readerId;
        Reader reader = null;
        // tim ban doc
        do{
            readerId =  new Scanner(System.in).nextInt();
            reader = readerlogic.searchReaderById(readerId);
            if (reader == null){
                System.out.println("Khong ton tai ban doc ang ma"+readerId+", vui long nhap lai: ");
            }
        }while(reader != null);
        return reader;
    }

    private  void saveBorrow(BookBorrowManagement bookBorrowManagement) {
        for (int i = 0; i < bookBorrowManagements.length; i++) {
            if(bookBorrowManagements[i] == null){
                bookBorrowManagements[i] = bookBorrowManagement;
                break;
            }
        }
    }
}
