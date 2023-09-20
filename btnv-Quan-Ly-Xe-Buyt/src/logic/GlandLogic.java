package logic;

import entity.Driver;
import entity.Gland;

import java.util.Scanner;

public class GlandLogic {
    Gland[] glands = new Gland[100];



    public Gland[] getGlands() {
        return glands;
    }

    public void inputGland() {
        System.out.print("Có bao nhiêu tuyến mới:  ");
        int numbeGland = new Scanner(System.in).nextInt();
        for (int i = 0; i < numbeGland; i++) {
            System.out.println("Nhập tuyến thứ " + (i + 1) + " :");
            Gland gland = new Gland();
            gland.inputInfo();
            saveGland(gland);
        }
    }

    private void saveGland(Gland gland) {
        for (int i = 0; i < glands.length; i++) {
            if(glands[i] == null){
                glands[i] = gland;
                break;
            }
        }
    }
    public void showGland() {
        for (int i = 0; i < glands.length; i++) {
            if(glands[i] != null){
                System.out.print("Tuyến thứ "+(i + 1)+" :");
                glands[i].printGland();
                System.out.println();
            }
        }
    }

    public Gland seachGlandRoute(int glandNumber) {
        for (int i = 0; i < glands.length; i++) {
            if(glands[i] != null && glands[i].getRoutecode() == glandNumber){}
                return glands[i];
        }
        return null;
    }
}
