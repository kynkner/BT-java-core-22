package enity;

import exception.InvaliAgeExcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    private int auto_id = 100;
    private int Id;
    private String Name;
    private float DepositInterestRates;

    public Bank() {
        Id = auto_id;
        auto_id++;
    }

    @Override
    public String toString() {
        return "Bank{" +
                ", Id=" + Id +
                ", Name='" + Name + '\'' +
                ", DepositInterestRates=" + DepositInterestRates +
                '}';
    }

    public int getAuto_id() {
        return auto_id;
    }

    public void setAuto_id(int auto_id) {
        this.auto_id = auto_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getDepositInterestRates() {
        return DepositInterestRates;
    }

    public void setDepositInterestRates(float depositInterestRates) {
        DepositInterestRates = depositInterestRates;
    }

    public void inputInfo() {
        System.out.print("Nhập tên ngân hàng: ");
        this.Name = new Scanner(System.in).nextLine();
        System.out.print("Nhập Lãi xuất tiền gửi: ");
        this.DepositInterestRates = inputnumber();
    }

    private float inputnumber() {
        float numer;
        do {
            try {
                numer = new Scanner(System.in).nextFloat();
                valinumer(numer);
                break;
            }catch (InputMismatchException e){
                System.out.print("Dữ liệu không hợp lệ, Vui lòng nhập lại: ");
            }catch (InvaliAgeExcetion e){
                System.out.print(e.getLocalizedMessage());
            }
        }while (true);
        return numer;
    }

    private void valinumer(float numer) throws InvaliAgeExcetion{
        if (numer > 0){
            return;
        }
        throw new InvaliAgeExcetion("Số phải lớn hơn 0, Vui lòn nhập lại: ");
    }
}
