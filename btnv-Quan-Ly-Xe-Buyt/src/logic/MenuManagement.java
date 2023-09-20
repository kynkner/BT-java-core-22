package logic;

import entity.Driver;

import java.util.Scanner;

public class MenuManagement {
    private driverlogic driverlogic= new driverlogic();
    private GlandLogic glandLogic = new GlandLogic();
    private AssignmentTableLogic assignmentTableLogic = new AssignmentTableLogic(driverlogic, glandLogic);
    public  void run() {
        while(true){
            prinMenu();
            int funtionChoise = chooseFuntion();
            switch (funtionChoise){
                case 1:
                    driverlogic.inputDriver();
                    break;
                case 2:
                    driverlogic.showDrive();
                    break;
                case 3:
                    glandLogic.inputGland();
                    break;
                case 4:
                    glandLogic.showGland();
                    break;
                case 5:
                    assignmentTableLogic.inputAssignmenttable();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;

            }

        }
    }

    private int chooseFuntion() {
        System.out.print("Xin mời lựa chọn chức năng: ");
        int funtionChoise;
        do {
            funtionChoise = new Scanner(System.in).nextInt();
            if(funtionChoise > 0 && funtionChoise < 9){
                break;
            }
            System.out.println("Chức năng không phù hợp, vui lòng chọn lại: ");
        }while(true);
        return funtionChoise;
    }

    private void prinMenu() {
        System.out.println("--------Quan lý xe buýt--------");
        System.out.println("1. Nhập lái xe mới");
        System.out.println("2. In danh sách lái xe");
        System.out.println("3. Nhập tuyến lái mới");
        System.out.println("4. In danh sách tuyến lái");
        System.out.println("5. Nhập dánh sách phân công");
        System.out.println("6. In danh sách phân công");
        System.out.println("7. Sắp xếp danh sách phân công: ");
        System.out.println("8. Bảng thống kê thổng rkhoangr cách chạy xe của mỗi lái xe");
    }
}
