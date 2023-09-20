package entity;

import java.util.Scanner;

public class Gland {
    public static int routecode_auto = 100;
    protected int routecode;
    protected int distance;
    protected  int numberOfStop;

    public Gland() {
        this.routecode = routecode_auto;
        routecode_auto++;
    }

    @Override
    public String toString() {
        return "Gland{" +
                "routecode=" + routecode +
                ", distance=" + distance +
                ", numberOfStop=" + numberOfStop +
                '}';
    }

    public static int getRoutecode_auto() {
        return routecode_auto;
    }

    public static void setRoutecode_auto(int routecode_auto) {
        Gland.routecode_auto = routecode_auto;
    }

    public int getRoutecode() {
        return routecode;
    }

    public void setRoutecode(int routecode) {
        this.routecode = routecode;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getNumberOfStop() {
        return numberOfStop;
    }

    public void setNumberOfStop(int numberOfStop) {
        this.numberOfStop = numberOfStop;
    }

    public void inputInfo() {
        System.out.println("Mã tuyến: "+routecode_auto);
        System.out.print("Nhập khoảng cách: ");
        this.setDistance(new Scanner(System.in).nextInt());
        System.out.print("Nhập điểm dừng: ");
        this.setNumberOfStop(new Scanner(System.in).nextInt());
    }

    public void printGland() {
        System.out.print(" Mã tuyến: "+routecode);
        System.out.print(", Khoảng cách: "+distance);
        System.out.print(", Điểm dừng: "+numberOfStop);
    }
}
