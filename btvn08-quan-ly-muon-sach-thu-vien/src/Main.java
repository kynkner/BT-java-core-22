import entity.Book;
import entity.BookBorrowManagement;
import entity.BookBorrowManagementDetail;
import entity.Reader;
import logichandle.MenuManagement;
import statics.Specialized;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuManagement menuManagement = new MenuManagement();
        menuManagement.run();
    }

}
