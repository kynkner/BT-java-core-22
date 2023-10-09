package logic;

import exception.InvaliAgeExcetion;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menulogic {
    private final ClientLogic clientLogic = new ClientLogic();
    private final BankLogic bankLogic = new BankLogic();
    private final SavingsNumberLogic savingsNumberLogic = new SavingsNumberLogic(clientLogic, bankLogic);
    public void run() {
        while (true){
            showMenu();
            int chooseFunction = inputChooseFunction();
            switch (chooseFunction){
                case 1:
                    clientLogic.inputClient();
                    break;
                case 2:
                    clientLogic.showClient();
                    break;
                case 3:
                    bankLogic.inputBank();
                    break;
                case 4:
                    bankLogic.showBank();
                    break;
                case 5:
                    savingsNumberLogic.input();
                    break;
                case 6:
                    savingsNumberLogic.showSaings();
                    break;
                case 7:
                    ShowMenu();
                    break;
                case 8:
                    break;
                case 9:
                    return;
            }
        }
    }

    private void ShowMenu() {
        System.out.println("Chọn 1 trong các sắp xếp sau: ");
        System.out.println("1. Theo họ tên khách hàng");
        System.out.println("2. Theo tên số tiền gửi");
        System.out.println("3. Thoát");
        int number = inputnumber();
        switch (number){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    private int inputnumber() {
        int number;
        do {
            try{
                number = new Scanner(System.in).nextInt();
                valinumber1(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("Dữ liệu không hợp lệ, Vui lòng nhập lại: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
        return number;
    }

    private void valinumber1(int number) throws InvaliAgeExcetion{
        if (number > 0 && number < 4){
            return;
        }
        throw new InvaliAgeExcetion("Không có chức năng, Vui lòng chọn lại: ");
    }

    private int inputChooseFunction() {
        System.out.print("Vui lòng chọn chức năng: ");
        int number;
        do {
            try{
                number = new Scanner(System.in).nextInt();
                valinumber(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("Dữ liệu không hợp lệ, Vui lòng nhập lại: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
            return number;
    }

    private void valinumber(int number) throws InvaliAgeExcetion{
        if (number > 0 && number < 10){
            return;
        }
        throw new InvaliAgeExcetion("Không có chức năng, Vui lòng chọn lại: ");
    }

    private void showMenu() {
        System.out.println("------Quản lý sổ tiết kiệm-------");
        System.out.println("1. Nhập danh sách khách hàng");
        System.out.println("2. In danh sách khách hàng");
        System.out.println("3. Nhập ngân hàng mới");
        System.out.println("4. In danh sách ngân hàng");
        System.out.println("5. Nhập danh sách sổ tích kiệm");
        System.out.println("6. In danh sách số tích kiệm");
        System.out.println("7. Sắp xếp sổ tiết kiệm");
        System.out.println("8. Bảng kê tổng số tiền cho mỗi khách hàng");
        System.out.println("9. thoát");
    }
}
