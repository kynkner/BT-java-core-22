package logic;

import exception.InvaliAgeExcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLogic {
    private final ClientLogic clientLogic = new ClientLogic();
    private final ServieLogic servieLogic = new ServieLogic();
    private InvoiceLogic invoiceLogic = new InvoiceLogic(clientLogic, servieLogic);
    public void run() {
        while (true) {
            ShowMenu();
            int Choofunstions = inputChofunstions();
            switch (Choofunstions) {
                case 1:
                    clientLogic.inputClientLogic();
                    break;
                case 2:
                    clientLogic.showClientLogic();
                    break;
                case 3:
                    servieLogic.inputServieLogic();
                    break;
                case 4:
                    servieLogic.showServieLogic();
                    break;
                case 5:
                    invoiceLogic.inputInvoiceLogic();
                    break;
                case 6:
                    invoiceLogic.showInvoiceLogic();
                    break;
                case 7:
                    ShowArranges();
                    break;
                case 8:
                    invoiceLogic.MoneyHaveToPay();
                    break;
                case 9:
                    System.out.println("Đang thoát...");
                    return;
            }
        }
    }

    private void ShowArranges() {
        System.out.println("Chọn 1 trong những kiểu sắp xếp sau: ");
        System.out.println("1. Sắp xếp theo họ tên khách hàng");
        System.out.println("2. Sắp xếp theo số lượng sử dụng(giảm dần)");
        System.out.println("3. Thoát");
        int number = inputnumber();
        switch (number){
            case 1:
                invoiceLogic.ArrangesName();
                break;
            case 2:
                invoiceLogic.ArrangesNumber();
                break;
            case 3:
                System.out.println("Đang thoát...");
                break;
        }
    }

    private int inputnumber() {
        System.out.print("Vui long chon chuc nang: ");
        int number;
        do {
            try{
                number = new Scanner(System.in).nextInt();
                valinumber(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }
            catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }

        }while (true);
        return number;

    }

    private void valinumber(int number) throws InvaliAgeExcetion{
        if (number > 0 && number < 4){
            return;
        }
        throw new InvaliAgeExcetion("Khong co chuc nang, vui long nhap lai: ");
    }

    private int inputChofunstions() {
        System.out.print("Vui long chon chuc nang: ");
        int choofunstions;
        do {
            try{
                choofunstions = new Scanner(System.in).nextInt();
                valichoofunstions(choofunstions);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }
            catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }

        }while (true);
        return choofunstions;
    }

    private void valichoofunstions(int choofunstions) throws InvaliAgeExcetion {
        if (choofunstions > 0 && choofunstions < 10){
            return;
        }
        throw new InvaliAgeExcetion("Khong co chuc nang, vui long nhap lai: ");
    }


    private void ShowMenu() {
        System.out.println("-----Quản Lý Dịch Vụ------");
        System.out.println("1. Nhập khách hàng");
        System.out.println("2. In danh sách khách hàng");
        System.out.println("3. Nhập dịch vụ ");
        System.out.println("4. In danh sách dịch vụ");
        System.out.println("5. Nhập hóa đơn cho mỗi khách hàng");
        System.out.println("6. In danh sách hóa đơn");
        System.out.println("7. Sắp xếp hóa đơn");
        System.out.println("8. Bảng kê số tiền phải trả cho mỗi khách hàng");
        System.out.println("9. Thoát");
    }
}
