package logics;

import entity.Factory;
import exception.InvaliAgeExcetion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FactoryLogic {
    List<Factory> factories = new ArrayList<>();

    public void inputFactory() {
        System.out.print("Co bao nhieu xuong san xuat moi: ");
        int number = inputNumber();
        for (int i = 0; i < number; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Nhap xuat san xuat thu "+(i + 1)+" :");
            Factory factory = new Factory();
            factory.inputInfo();
            saveFactory(factory);
        }
    }

    private void saveFactory(Factory factory) {
        factories.add(factory);
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

    public void showFactory() {
        System.out.println(factories);
    }

    public Factory seach(int number) {
        for (int i = 0; i < factories.size(); i++) {
            if (factories.get(i).getId() == number){
                return factories.get(i);
            }
        }
        return null;

    }

    public boolean isEmtyInputSerie() {
        return factories.isEmpty();
    }
}
