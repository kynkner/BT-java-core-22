package logichandle;

import entity.Book;

import java.util.Scanner;

public class Booklogic {
    private  Book[] books = new Book[100];

    public Book[] getBooks() {
        return books;
    }

    public  void inputBook(){

        System.out.print("Co bao nhieu loai sach moi: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap sach thu "+(i+1)+" : ");
            Book book = new Book();
            book.inputInfo();
            saveBooks(book);
        }
    }
    private   void saveBooks(Book book){
        for (int i = 0; i < this.books.length; i++) {
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    public  void printBook(){
        for (int i = 0; i < this.books.length; i++) {
            if(books[i] != null){
                System.out.print("Sach thu "+(i + 1)+" :");
                books[i].showBooks();
                System.out.println();
            }
        }
    }
    public Book searchBookById( int bookId){
        for (int k = 0; k < books.length; k++) {
            if(books[k] != null && books[k].getId() == bookId){
                return books[k];
            }
        }
        return null;
    }
}
