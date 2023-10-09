package logic;

import enity.Bank;
import enity.Client;
import enity.SavingsNumber;
import enity.SavingsNumberDetail;
import exception.InvaliAgeExcetion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SavingsNumberLogic {
    private ClientLogic clientLogic;
    private BankLogic bankLogic;
    List<SavingsNumber> savingsNumbers = new ArrayList<>();

    public SavingsNumberLogic(ClientLogic clientLogic, BankLogic bankLogic) {
        this.clientLogic = clientLogic;
        this.bankLogic = bankLogic;
    }

    public void input() {
        System.out.print("Có bao nhiêu khách hàng làm sổ tiết kiệm: ");
        int number = inputnumer();
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập mã khách hàng: ");
            Client client = IdClient();

            List<SavingsNumberDetail> details = inputDeatails();
            long total = 0;
            for (int j = 0; j < details.size(); j++) {
                total += total + details.get(i).getQuantity();
            }
            SavingsNumber savingsNumber = new SavingsNumber(client, details, total);
            saveSavingsNumber(savingsNumber);
        }
    }

    private void saveSavingsNumber(SavingsNumber savingsNumber) {
        savingsNumbers.add(savingsNumber);
    }

    private List<SavingsNumberDetail> inputDeatails() {
        System.out.print("Khách hàng lập sổ tiết kiệm ở bao nhiêu NGÂN HÀNG: ");
        int number = inputnumer();
        List<SavingsNumberDetail> details = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("-----------------------");
            System.out.print("Nhập mã ngân hàng: ");
            Bank bank = IdBank();

            System.out.print("Khách hàng lập bao nhiêu sổ tiết kiệm: ");
            int number1 = inputnumerDesit();
            for (int j = 0; j < number1; j++) {
                System.out.print("Số tiền khách hàng gửi tiết kiệm cua so"+(j + 1)+" :");
                long quantity = inputnumer2();
                details.add(new SavingsNumberDetail(bank, quantity));
            }
        }
        return details;
    }

    private long inputnumer2() {
        long number;
        do {
            try {
                number = new Scanner(System.in).nextLong();
                valinumber2(number);
                break;
            }catch (InputMismatchException e){
                System.out.print("Dữ liệu không hợp lệ, Vui lòng nhập lại: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
        return number;

    }

    private void valinumber2(long number) throws InvaliAgeExcetion{
        if (number > 0){
            return;
        }
        throw new InvaliAgeExcetion("Số phải lớn hơn 0, Vui lòn nhập lại: ");
    }

    private int inputnumerDesit() {
        int number;
        do {
            try {
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
        if (number  > 0 && number < 6){
            return;
        }
        throw new InvaliAgeExcetion("Số lượng tối đa 5, Vui lòng nhập lại: ");
    }

    private Bank IdBank() {
        int number;
        Bank bank;
        do {
            number = inputnumer();
            bank =bankLogic.search(number);
            if (bank != null){
                break;
            }
            System.out.print("Không tồn tại khách hàng mang mã "+number+", Vui lòng nhập lai: ");
        }while (true);
        return bank;

    }

    private int inputnumer() {
        int number;
        do {
            try {
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
        if (number > 0){
            return;
        }
        throw new InvaliAgeExcetion("Số phải lớn hơn 0, Vui lòn nhập lại: ");
    }

    private Client IdClient() {
    int number;
    Client client;
    do {
        number = inputnumer();
        client =clientLogic.search(number);
        if (client != null){
            break;
        }
        System.out.print("Không tồn tại khách hàng mang mã "+number+", Vui lòng nhập lai: ");
    }while (true);
    return client;
    }

    public void showSaings() {
        System.out.println(savingsNumbers);
    }
}
