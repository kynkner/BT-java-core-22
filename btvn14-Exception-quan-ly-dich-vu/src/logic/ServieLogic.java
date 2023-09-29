package logic;

import entity.Client;
import entity.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ServieLogic {
    Service[] services = new Service[100];

    public void inputServieLogic() {
        System.out.print("Có bao nhiêu dịch vụ mới: ");
        int number = inputnummber();
        for (int i = 0; i < number; i++) {
            System.out.println("-----------------------------");
            System.out.println("Nhập dịch vụ thứ "+(i + 1));
            Service service = new Service();
            service.inputInfo();
            saveSevice(service);
        }
    }

    private int inputnummber() {
        int number;
        do {
            try {
                number = new Scanner(System.in).nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }
        }while (true);
        return number;
    }

    private void saveSevice(Service service) {
        for (int i = 0; i < services.length; i++) {
            if(services[i] == null){
                services[i] = service;
                return;
            }
        }
    }

    public void showServieLogic() {
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null){
                System.out.print("Dịch vụ "+(i+ 1)+": ");
                services[i].printServices();
                System.out.println();
            }
        }
    }

    public Service seacherServie(int number) {
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null && services[i].getId() == number){
                return services[i];
            }
        }
        return null;
    }

    public boolean isEmtyInputSerie() {
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null){
                return false;
            }
        }
        return true;
    }
}
