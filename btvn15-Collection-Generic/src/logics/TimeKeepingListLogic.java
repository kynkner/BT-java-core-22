package logics;

import entity.Factory;
import entity.TimekeepingList;
import entity.TimekeepingListDetail;
import entity.Worker;
import exception.InvaliAgeExcetion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TimeKeepingListLogic {
    private WorkerLogic workerLogic;
    private FactoryLogic factoryLogic;
    List<TimekeepingList> timekeepingLists = new ArrayList<>();

    public TimeKeepingListLogic(WorkerLogic workerLogic, FactoryLogic factoryLogic) {
        this.workerLogic = workerLogic;
        this.factoryLogic = factoryLogic;
    }

    public void inputTimekepingList() {
        if (workerLogic.isEmtyInputClient() || factoryLogic.isEmtyInputSerie()){
            System.out.println("Chua co du lieu khach hang hoac dich vu, vui long kiem tra lai");
            return;
        }
        System.out.println("Co bao nhieu cong nhan can cham cong ");
        int numberWorker = inputNumber();
        for (int i = 0; i < numberWorker; i++) {
            System.out.println("Nhap ma cong nhan: ");
            Worker worker = NumberIdWorker();

            List<TimekeepingListDetail> details = inputDetails();
            TimekeepingList timekeepingList = new TimekeepingList(worker, details);
            saveTimekeepinglist(timekeepingList);

        }
    }

    private void saveTimekeepinglist(TimekeepingList timekeepingList) {
        timekeepingLists.add(timekeepingList);
    }

    private List<TimekeepingListDetail> inputDetails() {
        System.out.println("Cong nhan da lam bao nhieu xuong trong 30 ngay: ");
        int numberFactory = inputNumber();
        List<TimekeepingListDetail> details = new ArrayList<>();

        do {
            for (int i = 0; i < numberFactory; i++) {
                System.out.print("Nhap ma xuong san xuat: ");
                Factory factory = NumberIdFactory();
                System.out.print("Nhap so ngay lam o xuong san xuat thu " + (i + 1) + " : ");
                int quantity = inputNumber();
                details.add(new TimekeepingListDetail(factory, quantity));
            }
            int sum = 0;
            for (int i = 0; i < details.size(); i++) {
                sum += details.get(i).getQuantity();
            }
            System.out.println(sum);
            if (sum < 31){
                break;
            }
            System.out.println("aklsbjcakjs");
        }while (true);
        return details;
    }

    private Factory NumberIdFactory() {
        int number;
        Factory factory;
        do {
            number = inputNumber();
            factory = factoryLogic.seach(number);
            if (factory != null){
                break;
            }
            System.out.println("khong ton tai ban doc voi ma "+ number +", Vui long nhap lai: ");
        }while (true);
        return factory;

    }


    private Worker NumberIdWorker() {
        int number;
        Worker worker;
        do {
            number = inputNumber();
            worker = workerLogic.seach(number);
            if (worker != null){
                break;
            }
            System.out.println("khong ton tai ban doc voi ma "+ number +", Vui long nhap lai: ");
        }while (true);
        return worker;
    }

    private int inputNumber() {
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
        return number;
    }
    private void valinumber(int number) throws InvaliAgeExcetion {
        if (number > 0){
            return;
        }
        throw new InvaliAgeExcetion("So phai lon hon 0, vui long nhap lai: ");
    }
}
