package logic;

import enity.Client;
import exception.InvaliAgeExcetion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClientLogic {
    List<Client> clients = new ArrayList<>();

    public void inputClient() {
        System.out.print("Có bao nhiêu khách hàng mới: ");
        int numberClient = inputNumberClient();
        for (int i = 0; i < numberClient; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Nhập khách hàng thứ "+(i + 1)+" : ");
            Client client = new Client();
            client.inputInfo();
            saveClient(client);
        }
    }

    private void saveClient(Client client) {
        clients.add(client);
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

    public void showClient() {
        System.out.println(clients);
    }

    public Client search(int number) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == number){
                return clients.get(i);
            }
        }
        return null;
    }
}
