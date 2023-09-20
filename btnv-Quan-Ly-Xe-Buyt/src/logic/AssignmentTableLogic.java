package logic;

import entity.AssignmentTable;
import entity.AssignmentTableBorrow;
import entity.Driver;
import entity.Gland;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AssignmentTableLogic {
    private driverlogic driverlogic;
    private GlandLogic glandLogic;

    private AssignmentTable[] assignmentTables = new AssignmentTable[100];


    public AssignmentTableLogic(logic.driverlogic driverlogic, GlandLogic glandLogic) {
        this.driverlogic = driverlogic;
        this.glandLogic = glandLogic;
    }

    public void inputAssignmenttable() {
        System.out.println("Nhập số lượng lái xe cần phân công: ");
        int driverNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNumber; i++) {
            System.out.println("Nhập thông tin lái xe "+(i + 1));
            Driver driver = checkDiver();

            AssignmentTableBorrow[] details = inputDriverDetails();
        }
    }

    private AssignmentTableBorrow[] inputDriverDetails() {
        System.out.println("Lái xe được phân công bao nhiêu tuyến");
        int glandnumber = new Scanner(System.in).nextInt();
        AssignmentTableBorrow[] details = new AssignmentTableBorrow[glandnumber];
        int cout = 0;
        for (int i = 0; i < glandnumber; i++) {
            System.out.println("Nhập thông tin tuyén "+(i + 1));
            Gland gland = chechGland();

            System.out.println("Lái xe đi qua tuyến "+gland.getRoutecode()+" bao nhiêu lượt: ");
            int quantity = new Scanner(System.in).nextInt();
            AssignmentTableBorrow detail = new AssignmentTableBorrow(gland, quantity);
            details[cout] = detail;
            cout++;
        }
        return details;
    }

    private Gland chechGland() {
        System.out.println("Nhập mã tuyến: ");
        int glandNumber;
        Gland gland = null;
        do {
            glandNumber = new Scanner(System.in).nextInt();
            gland = glandLogic.seachGlandRoute(glandNumber);
            if(gland != null){
                break;
            }
            System.out.println("Không tồn tại tuyến với mã "+glandNumber+", Xin vui lòng nhập lại: " );
        }while(true);
        return gland;
    }

    private Driver checkDiver() {
        System.out.print("Nhập mã lái xe: ");
        int drivenumber;
        Driver driver = null;
        do {
            drivenumber = new Scanner(System.in).nextInt();
            driver = driverlogic.seachDrierRoute(drivenumber);
            if(driver != null){
                break;
            }
            System.out.print("Không tồn tại lái xe có mã "+drivenumber+" , Xin vui lòng nhập lại;  ");
        }while (true);
        return driver;
    }
}
