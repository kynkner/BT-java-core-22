package logichandle;

import entity.Reader;

import java.util.Scanner;

public class readerlogic {
    private Reader[] readers = new Reader[100];

    public Reader[] getReaders() {
        return readers;
    }

    public void inputReader() {
        System.out.print("Co bao nhieu ban doc moi: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap ban doc thu " + (i + 1) + " :");
            Reader reader = new Reader();
            reader.inputInfo();
            saveReader(reader);
        }
    }

    private void saveReader(Reader reader) {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {
                readers[i] = reader;
                break;
            }
        }
    }

    public void printStudent() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.print("Ban doc thu " + (i + 1) + " :");
                readers[i].showStudents();
                System.out.println();
            }
        }
    }

    public Reader searchReaderById(int readerId) {
        for (int j = 0; j < readers.length; j++) {
            if (readers[j] != null && readers[j].getId() == readerId) {
                return readers[j];
            }
        }
        return null;
    }
    public  void arrangeName(){
        for (int i = 0; i < readers.length - 1; i++) {
            for (int j = i + 1; j < readers.length; j++) {
                String reader1 = readers[i].getName();
                String reader2 = readers[j].getName();
                int minLenght = Math.min(reader1.length(), reader2.length());
                int number = 0;
                while(number < minLenght){
                    char charreader1 = reader1.charAt(number);
                    char charreader2 = reader2.charAt(number);
                    if(charreader1 != charreader2){
                        if(charreader1 > charreader2){
                            Reader temp = readers[i];
                            readers[i] = readers[j];
                            readers[j] = temp;
                        }
                        break;
                    }
                    number++;
                }
                if(reader1.length() > reader2.length()){
                    Reader temp = readers[i];
                    readers[i] = readers[j];
                    readers[j] = temp;
                }
            }
        }
    }

}