package logic;

import enity.Bank;
import enity.Client;
import exception.InvaliAgeExcetion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankLogic {
    List<Bank> banks = new ArrayList<>();

    public void inputBank() {
        System.out.print("Có bao nhiêu ngân hàng mới: ");
        int numberClient = inputNumberClient();
        for (int i = 0; i < numberClient; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Nhập ngân hàng thứ " + (i + 1) + " : ");
            Bank bank = new Bank();
            bank.inputInfo();
            saveBank(bank);
        }
    }

    private void saveBank(Bank bank) {
        banks.add(bank);
    }

    private int inputNumberClient() {
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
        if (number > 0 && number < 4){
            return;
        }
        throw new InvaliAgeExcetion("Số phải lớn hơn 0, Vui lòn nhập lại: ");
    }

    public void showBank() {
        System.out.println(banks);
    }

    public Bank search(int number) {
        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getId() == number){
                return banks.get(i);
            }
        }
        return null;
    }
}
