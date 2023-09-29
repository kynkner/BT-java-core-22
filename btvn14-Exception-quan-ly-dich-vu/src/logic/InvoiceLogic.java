package logic;

import entity.Client;
import entity.InvoiceDetails;
import entity.Invoive;
import entity.Service;
import exception.InvaliAgeExcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceLogic {
    private ClientLogic clientLogic;
    private ServieLogic servieLogic;
    Invoive[] invoives = new Invoive[100];

    public InvoiceLogic(ClientLogic clientLogic, ServieLogic servieLogic) {
        this.clientLogic = clientLogic;
        this.servieLogic = servieLogic;
    }

    public void inputInvoiceLogic() {
        if (clientLogic.isEmtyInputClient() || servieLogic.isEmtyInputSerie()){
            System.out.println("Chua co du lieu khach hang hoac dich vu, vui long kiem tra lai");
            return;
        }
        System.out.print("Có bao nhiêu hóa đơn cho mỗi khách hàng: ");
        int number = inputnumber();
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập mã khách hàng: ");
            Client client = checksClient();

            System.out.print("Có bao nhiêu dịch vụ khách hàng đã chọn: ");
            int numberSerice = checkNumberService();
            InvoiceDetails[] details =  inputdetails(numberSerice);
            int total = 0;
            for (int j = 0; j < details.length; j++) {
                total += details[j].getQuantity();
            }
            Invoive invoive = new Invoive(client, details, total);
            saveInvoive(invoive);
        }
    }

    private int inputnumber() {
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


    private int checkNumberService() {
        int numberrSerice;
        do {
            try {
                numberrSerice = new Scanner(System.in).nextInt();
                valiNumberSerice(numberrSerice);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
        return numberrSerice;
    }

    private void valiNumberSerice(int numberrSerice) throws InvaliAgeExcetion {
        if (numberrSerice > 0 && numberrSerice < 6){
            return;
        }
        throw new InvaliAgeExcetion("Nhập quá số lượng(số lượng tối đa là 5), vui long nhập lại: ");
    }

    private void saveInvoive(Invoive invoive) {
        for (int i = 0; i < invoives.length; i++) {
            if(invoives[i] == null){
                invoives[i] = invoive;
                return;
            }
        }
    }

    private InvoiceDetails[] inputdetails(int numberSerice) {
        InvoiceDetails[] details = new InvoiceDetails[numberSerice];
        int count = 0;
        for (int i = 0; i < numberSerice; i++) {
            System.out.print("Nhập mã dịch vu: ");
            Service service = checkService();
            System.out.print("Số lượng đã sử dụng dịch vụ: ");
            int quantity = checkquantity();
            details[count] = new InvoiceDetails(service, quantity);
            count++;
        }
        return details;
    }

    private int checkquantity() {
        int quantity;
        do {
            try {
                quantity = new Scanner(System.in).nextInt();
                valiQuantity(quantity);
                break;
            }catch (InputMismatchException e){
                System.out.print("du lieu khong hop le, vui long nhap lai: ");
            }catch (InvaliAgeExcetion e){
                System.out.println(e.getLocalizedMessage());
            }
        }while (true);
        return quantity;
    }

    private void valiQuantity(int quantity) throws InvaliAgeExcetion{
        if (quantity > 0){
            return;
        }
        throw new InvaliAgeExcetion("Số lượng phải lớn hơn 0, Vui lòng nhập lại: ");
    }

    private Service checkService() {
        int number;
        Service service;
        do {
            number = inputnumber();
            service = servieLogic.seacherServie(number);
            if (service != null){
                break;
            }
            System.out.println("Không có dịch vụ mang mã "+number+", Vui lòng Nhập lại: ");
        }while (true);
        return service;
    }

    private Client checksClient() {
        int number;
        Client client;
       do {
           number = inputnumber();
           client = clientLogic.seacher(number);
           if (client != null){
               break;
           }
           System.out.println("Không có khách hàng mang mã "+number+", Vui long nhâp lại: ");
       }while (true);
       return client;
    }


    public void showInvoiceLogic() {
        for (int i = 0; i < invoives.length; i++) {
            if (invoives[i] != null){
                System.out.println(invoives[i]);
            }
        }
    }

    public void ArrangesName() {
        if (clientLogic.isEmtyInputClient()){
            System.out.println("Chua co du lieu khach hang , vui long kiem tra lai");
            return;
        }
        for (int i = 0; i < invoives.length - 1; i++) {
            if(invoives[i] == null){
                continue;
            }
            for (int j = i + 1; j < invoives.length; j++) {
                if (invoives[i] == null){
                    continue;
                }
                if(invoives[i].getClient().getName().trim().compareToIgnoreCase(invoives[j].getClient().getName().trim()) > 0){
                    Invoive temp = invoives[i];
                    invoives[i] = invoives[j];
                    invoives[j] = temp;
                }
            }
        }
        showInvoiceLogic();
    }

    public void ArrangesNumber() {
        for (int i = 0; i < invoives.length - 1; i++) {
            if(invoives[i] == null){
                continue;
            }
            for (int j = i + 1; j < invoives.length; j++) {
                if (invoives[i] == null){
                    continue;
                }
                if(invoives[i].getTotal() < invoives[j].getTotal()){
                    Invoive temp = invoives[i];
                    invoives[i] = invoives[j];
                    invoives[j] = temp;
                }
            }
        }
        showInvoiceLogic();
    }

    public void MoneyHaveToPay() {
        if (servieLogic.isEmtyInputSerie()){
            System.out.println("Chua co du lieu dich vu , vui long kiem tra lai");
            return;
        }
        for (int i = 0; i < invoives.length; i++) {
            double sum = 0;
            Invoive invoive = invoives[i];
            InvoiceDetails[] invoiceDetails = invoive.getDetails();
            for (int j = 0; j < invoiceDetails.length; j++) {
                sum += invoiceDetails[j].getService().getRates() * invoiceDetails[j].getQuantity();
            }
            System.out.println("Số tiền khách hàng "+invoives[i].getClient().getName()+" là: "+sum);
        }
    }


}
