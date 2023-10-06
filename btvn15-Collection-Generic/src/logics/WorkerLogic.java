package logics;

import entity.Worker;
import exception.InvaliAgeExcetion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WorkerLogic {
        List<Worker> workers = new ArrayList<>();
        public void inputWorker() {
                System.out.print("Có bao nhiêu công nhân mới: ");
                int number = inputnumber();
                for (int i = 0; i < number; i++) {
                        System.out.println("------------------------------------");
                        System.out.println("Nhap cong nhan thu "+(i + 1)+" : ");
                        Worker worker = new Worker();
                        worker.inputInfo();
                        saveWorker(worker);
                }
        }

        private void saveWorker(Worker worker) {
                workers.add(worker);
        }

        private int inputnumber() {
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

        public void showworker() {
                System.out.println(workers);
        }

        public Worker seach(int number) {
                for (int i = 0; i < workers.size(); i++) {
                        if (workers.get(i).getId() == number){
                                return workers.get(i);
                        }
                }
                return null;
        }

        public boolean isEmtyInputClient() {
                return workers.isEmpty();
        }
}
