package logics;

import exception.InvaliAgeExcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLogic {
    private WorkerLogic workerLogic = new WorkerLogic();
    private FactoryLogic factoryLogic = new FactoryLogic();
    private TimeKeepingListLogic timeKeepingListLogic = new TimeKeepingListLogic(workerLogic, factoryLogic);
    public void run() {
        while (true){
            showMenu();
            int choofuntion = inputChofuntion();
            switch (choofuntion){
                case 1:
                    workerLogic.inputWorker();
                    break;
                case 2:
                    workerLogic.showworker();
                    break;
                case 3:
                    factoryLogic.inputFactory();
                    break;
                case 4:
                    factoryLogic.showFactory();
                    break;
                case 5:
                    timeKeepingListLogic.inputTimekepingList();
                    break;
                case 6:
                    break;
                case 7:
                    showArrange();
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Đang thoát...");
                    return;
            }
        }
    }

    private void showArrange() {
        System.out.println("-----Chọn chức năng----");
        System.out.println("1. Sắp xếp theo tên công nhân");
        System.out.println("2. Sắp xếp theo xưởng");
        System.out.println("3. Thoát");
        int number;
        do {
            try {
                number = new Scanner(System.in).nextInt();
                valinumber(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
        switch (number){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    private void valinumber(int number) throws InvaliAgeExcetion {
        if (number > 0 && number < 4){
            return;
        }
        throw new InvaliAgeExcetion("Không có chức năng, Vui lòng chọn lại: ");
    }

    private int inputChofuntion() {
        System.out.print("Vui lòng chọn chức năng: ");
        int chofuntion;
        do {
            try {
                chofuntion = new Scanner(System.in).nextInt();
                valichoofunstions(chofuntion);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
            return chofuntion;
    }

    private void valichoofunstions(int chofuntion) throws InvaliAgeExcetion {
        if (chofuntion > 0 && chofuntion < 10){
            return;
        }
        throw new InvaliAgeExcetion("Không có chức năng, Vui lòng chọn lại: ");
    }

    private void showMenu() {
        System.out.println("-------Quản lý công xưởng-------");
        System.out.println("1. Nhập công nhân mới");
        System.out.println("2. In danh sách các công nhân");
        System.out.println("3. Nhập xưởng sản xuất");
        System.out.println("4. In danh sách xưởng sản xuất");
        System.out.println("5. Nhập bảng chấm công");
        System.out.println("6. In danh sách bảng chấm công");
        System.out.println("7. Sắp xếp danh sách bảng phân công");
        System.out.println("8. Bảng kê thu nhập cho mỗi công nhân trong tháng");
        System.out.println("9. Thoát");
    }
}
