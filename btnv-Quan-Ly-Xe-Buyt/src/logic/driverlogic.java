package logic;

import entity.Driver;

import java.util.Scanner;

public class driverlogic {
    private Driver[] drivers = new Driver[100];

    public Driver[] getDrivers() {
        return drivers;
    }

    public void inputDriver(){
        System.out.print("Có bao nhiêu lái xe mới:  ");
        int numbeDriver =  new Scanner(System.in).nextInt();
        for (int i = 0; i < numbeDriver; i++) {
            System.out.println("Nhập lái xe thứ "+( i+ 1)+" :");
            Driver driver = new Driver();
            driver.inputInfo();
            saveDirver(driver);
        }
    }
    private void saveDirver(Driver driver){
        for (int i = 0; i < drivers.length; i++) {
            if(drivers[i] == null){
                drivers[i] = driver;
                break;
            }
        }
    }
    public void showDrive(){
        for (int i = 0; i < drivers.length; i++) {
            if(drivers[i] != null){
                System.out.print("Lái xe "+(i + 1)+" :");
                drivers[i].frintDiver();
                System.out.println();
            }
        }
    }


    public Driver seachDrierRoute(int drivenumber) {
        for (int i = 0; i < drivers.length; i++) {
            if(drivers[i] != null && drivers[i].getId() == drivenumber){}
                return drivers[i];
        }
        return null;
    }
}
