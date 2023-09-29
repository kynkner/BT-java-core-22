package logic;

import entity.Client;

import java.io.StringReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientLogic {
    Client[] clients = new Client[100];

    public void inputClientLogic() {
        System.out.print("Có bao nhiêu khách hàng mới: ");
        int number = inputnummber();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập khách hàng thứ "+(i + 1));
            Client client = new Client();
            client.inputInfo();
            saveClient(client);
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

    private void saveClient(Client client) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null){
                clients[i] = client;
                return;
            }
        }
    }

    public void showClientLogic() {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null){
                System.out.print("Khách hàng "+(i+ 1)+": ");
                clients[i].printClients();
                System.out.println();
            }
        }
    }

    public Client seacher(int number) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null && clients[i].getId() == number){
                return clients[i];
            }
        }
        return null;
    }

    public boolean isEmtyInputClient() {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null){
                return false;
            }
        }
        return  true;
    }
}
