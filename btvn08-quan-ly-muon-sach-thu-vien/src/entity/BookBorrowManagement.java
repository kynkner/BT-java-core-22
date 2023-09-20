package entity;

import java.util.Arrays;

public class BookBorrowManagement {
  private Reader reader;
 private BookBorrowManagementDetail[] details;

    public BookBorrowManagement(Reader reader, BookBorrowManagementDetail[] details) {
        this.reader = reader;
        this.details = details;
    }

    @Override
    public String toString() {
        return "BookBorrowManagement{" +
                "reader=" + reader +
                ", details=" + Arrays.toString(details) +
                '}';
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public BookBorrowManagementDetail[] getDetails() {
        return details;
    }

    public void setDetails(BookBorrowManagementDetail[] details) {
        this.details = details;
    }
    public void showBooksBorrow(){
        System.out.print(" Ma ban doc: "+reader);


    }
}
