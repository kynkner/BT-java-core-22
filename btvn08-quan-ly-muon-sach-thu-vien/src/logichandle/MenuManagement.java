package logichandle;

import entity.Book;
import entity.BookBorrowManagement;
import entity.BookBorrowManagementDetail;
import entity.Reader;

import java.util.Scanner;

public class MenuManagement {
    private final Booklogic booklogic = new Booklogic();
    private final readerlogic readerlogic = new readerlogic();
    private final BookBorrowlogic bookBorrowlogic = new BookBorrowlogic(booklogic, readerlogic);



    public  void run() {
        while (true){
            prinMenu();
            int funtionChoise = chooseFuntion();
            switch (funtionChoise){
                case 1:
                    booklogic.inputBook();
                    break;
                case 2:
                    booklogic.printBook();
                    break;
                case 3:
                    readerlogic.inputReader();
                    break;
                case 4:
                    readerlogic.printStudent();
                    break;
                case 5:
                    bookBorrowlogic.borrowBook();
                    break;
                case 6:
                    bookBorrowlogic.showBorrow();
                    break;
                case 7:
                    readerlogic.arrangeName();
                    arrageNumberBooks();
                    //sap xep giam dan: theo ten, theo so luong sach muon dc
                    break;
                case 8:
                    searchanddisplay();
                    //tim kiem va hien thi danh sach muon sach theo ten ban doc
                    break;
                case 9:
                    return;

            }
        }
    }




    public static void prinMenu() {
        System.out.println("-------Phần mêm quản lý mươn sách thư viện-------");
        System.out.println("1. Nhập danh sách đầu vào");
        System.out.println("2. In danh sách các cuốn sách");
        System.out.println("3. Nhâp danh sách bạn đọc mới");
        System.out.println("4. In danh sách bạn đọc");
        System.out.println("5. Lập bảng mượn sách");
        System.out.println("6. In danh sách mượn sách");
        System.out.println("7. Sắp xếp danh sách mượn");
        System.out.println("8. Tìm kiếm bạn đọc trong danh sách mượn sách");
        System.out.println("9. Thoát");

    }

    public static int chooseFuntion() {
        System.out.print("Xin moi lua chon chuc nang: ");
        int funtionChoise ;
        do{
            funtionChoise = new Scanner(System.in).nextInt();
            if(funtionChoise >= 1 && funtionChoise <= 9){
                break;
            }
            System.out.println("Chức nắng nhập không hợp lệ, xin vui lòng nhập lại...");
        }while(true);
        return funtionChoise;
    }

    public static void arrageNumberBooks(){

    }
    public static void searchanddisplay(){

    }
}
