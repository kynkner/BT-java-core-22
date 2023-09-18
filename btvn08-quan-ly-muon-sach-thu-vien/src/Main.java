import entity.Book;
import entity.Reader;
import statics.Specialized;

import java.util.Scanner;

public class Main {
    private  static Reader[] readers = new Reader[100];
    private  static Book[] books = new Book[100];
    public static void main(String[] args) {
       while (true){
           prinMenu();
           int funtionChoise = chooseFuntion();
           switch (funtionChoise){
               case 1:
                   inputBook();
                   break;
               case 2:
                   printBook(books);
                   break;
               case 3:
                   inputReader();
                   break;
               case 4:
                   printStudent(readers);
                   break;
               case 5:
                   printMenuBorrow();
                   break;
               case 6:
                   //----
                   break;
               case 7:
                   arrangeName(readers);
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
    public  static void inputReader(){
        System.out.print("Co bao nhieu ban doc moi: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap ban doc thu "+(i + 1)+" :");
            Reader reader = new Reader();
            reader.inputInfo();
            saveReader(reader);
        }
    }
    public static void saveReader(Reader reader){
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] == null){
                readers[i] = reader;
                break;
            }
        }
    }
    public static void printStudent(Reader[] readers){
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] != null){
                System.out.print("Ban doc thu "+(i + 1)+" :");
                readers[i].showStudents();
                System.out.println();
            }
        }
    }
    public static void inputBook(){
        System.out.print("Co bao nhieu loai sach moi: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap sach thu "+(i+1)+" : ");
            Book book = new Book();
            book.inputInfo();
            saveBooks(book);
        }
    }
    public static void saveBooks(Book book){
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    public static void printBook(Book[] books){
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                System.out.print("Sach thu "+(i + 1)+" :");
                books[i].showBooks();
                System.out.println();
            }
        }
    }
    public static void arrangeName(Reader[] readers){
        for (int i = 0; i < readers.length - 1; i++) {
            for (int j = i + 1; j < readers.length; j++) {
                String reader1 = readers[i].getName();
                String reader2 = readers[j].getName();
                int minLenght = Math.min(reader1.length(), reader2.length());
                int number = 0;
                while(number < minLenght){
                    char charreader1 = reader1.charAt(number);
                    char charreader2 = reader2.charAt(number);
                    if(charreader1 != charreader2){
                        if(charreader1 > charreader2){
                            Reader temp = readers[i];
                            readers[i] = readers[j];
                            readers[j] = temp;
                        }
                        break;
                    }
                    number++;
                }
                if(reader1.length() > reader2.length()){
                    Reader temp = readers[i];
                    readers[i] = readers[j];
                    readers[j] = temp;
                }
            }
        }
    }
    public static void printMenuBorrow(){
        Book book = new Book();
        System.out.println( "Chon ban doc: ");
        printNameStudent(readers);
        int number = new Scanner(System.in).nextInt();
        int numberSpecializes = 0;
        for (int i = 0; i < readers.length; i++) {
            if(number == i + 1 ){
               while(numberSpecializes <= 5){
                   System.out.println("Chon 1 trong cac chuyen nganh sau; ");
                   System.out.println("1. Khoa hoc tu nhien");
                   System.out.println("2. Van hoc- Nghe thuat");
                   System.out.println("3. Dien tu vien thong");
                   System.out.println("4. Cong nghe thong tin");
                   System.out.println("5. Luu/Thoat.");
                   int type = new Scanner(System.in).nextInt();
                   switch (type){
                       case 1:
                           book.setSpecialized(Specialized.NaturalSciences);
                           System.out.println("Chon sach ban muon muon: ");
                           prinNameBook(books, type);
                           int numberBook = new Scanner(System.in).nextInt();
                           for (int j = 0; j < books.length; j++) {
                               if(numberBook == j + 1){
                                   System.out.println("So luong muon muon: ");
                                    int temp = new Scanner(System.in).nextInt();
                                    if(temp <= 3){
                                        numberSpecializes = temp;
                                    }
                                   System.out.println("Qua so luong quy dinh");
                               }
                           }
                           break;
                       case 2:
                           book.setSpecialized(Specialized.LiteratureArts);

                           break;
                       case 3:
                           book.setSpecialized(Specialized.ElectronicsandTelecommunication);

                           break;
                       case 4:
                           book.setSpecialized(Specialized.Informationtechnology);

                           break;
                       case 5:
                           return;
                   }
                   numberSpecializes++;
               }
            }
        }


    }
    public static void printNameStudent(Reader[] readers){
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] != null){
                System.out.print("Ban doc thu "+(i + 1)+" :");
                readers[i].showNameStudents();
                System.out.println();
            }
        }
    }
    public static void prinNameBook(Book[] books, int n ){
        Book book = new Book();
        String name = "Khoa hoc tu nhien";
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                if(n == 1){


                }
            }
        }
    }



    public static void arrageNumberBooks(){
        
    }
    public static void searchanddisplay(){
          
    }

}
