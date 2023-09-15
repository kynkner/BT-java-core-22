package bai2;

import java.util.Collection;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Student2[] listStudent = moreStudent();

        studentPrinting(listStudent);

        arrangeStudent(listStudent);
        studentPrinting(listStudent);




    }

    public static void studentPrinting(Student2[] mangsv) {
        for (int i = 0; i < mangsv.length; i++) {
            System.out.print("Thong tin sinh vien "+(i+1)+" : ");
            mangsv[i].showStudents();
            System.out.println();
        }
    }

    public static void arrangeStudent(Student2[] listStudent) {
        System.out.println("Sap xep danh sach theo ten: ");
        for (int i = 0; i < listStudent.length - 1; i++) {
            for (int j = i + 1; j < listStudent.length; j++) {
                String tenSV1 = listStudent[i].Name;
                String tenSV2 = listStudent[j].Name;

                int minLength = Math.min(tenSV1.length(), tenSV2.length());
                int k = 0;
                while (k < minLength) {
                    char charSV1 = tenSV1.charAt(k);
                    char charSV2 = tenSV2.charAt(k);

                    if (charSV1 != charSV2) {
                        if (charSV1 > charSV2) {
                            Student2 temp = listStudent[i];
                            listStudent[i] = listStudent[j];
                            listStudent[j] = temp;
                        }
                        break;
                    }
                    k++;
                }

                if (k == minLength) {
                    if (tenSV1.length() > tenSV2.length()) {
                        Student2 temp = listStudent[i];
                        listStudent[i] = listStudent[j];
                        listStudent[j] = temp;
                    }
                }
            }
        }


    }


    public static void printStudentsByClass(Student2[] listStudent) {
        String Clas = new Scanner(System.in).nextLine();
        for(Student2 sv : listStudent){
            if(classCheck(sv, Clas)){
                System.out.println(sv);
            }
        }
    }

    public static boolean classCheck(Student2 sv, String classtofind) {
            return sv.Class == classtofind;
    }
    public static Student2[] moreStudent() { 
        System.out.print("Nhap so luong sinh vien: ");
        int n = new Scanner(System.in).nextInt();
        Student2[] mangsv = new Student2[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu "+(i + 1)+" :");
            mangsv[i] = new Student2();
            mangsv[i].declareInformation();
        }
        return mangsv;
    }
}
