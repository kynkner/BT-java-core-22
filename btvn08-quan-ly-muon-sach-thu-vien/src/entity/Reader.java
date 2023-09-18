package entity;

import statics.ReaderType;

import java.util.Scanner;

public class Reader extends person {
    private static int auto_id = 10000;
    private int Id;
    private ReaderType readerType;
    public Reader(){
        this.Id = auto_id;
        auto_id ++;
    }
    @Override
    public String toString() {
        return "Reader{" +
                "Id='" + Id + '\'' +
                ", readerType=" + readerType.value +
                ", Name='" + Name + '\'' +
                ", Aadress='" + Aadress + '\'' +
                ", Phone=" + Phone +
                '}';
    }
    public void setId(int id) {
        Id = id;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }
    public int getId() {
        return Id;
    }
    public ReaderType getReaderType() {
        return readerType;
    }
    public void inputInfo(){
        super.inputInfo();
        System.out.println("Nhap loai ban doc 1 trong cac loai:   ");
        System.out.println("1. Sinh vien");
        System.out.println("2. Hoc vien cao hoc");
        System.out.println("3. Giang vien");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setReaderType(ReaderType.STUDENT);
                break;
            case 2:
                this.setReaderType(ReaderType.POST_STUDENT);
                break;
            case 3:
                this.setReaderType(ReaderType.TEACHER);
                break;
        }
    }
    public void showStudents(){
        System.out.print(" Ma ban doc: "+Id);
        System.out.print(", loai ban doc: "+readerType.value);
        System.out.print(", Ten : "+Name);
        System.out.print(", Dia chi: "+Aadress);
        System.out.print(", So dien thoai: "+Phone);
    }
    public void showNameStudents(){
        System.out.print("  "+Name);

    }
}
