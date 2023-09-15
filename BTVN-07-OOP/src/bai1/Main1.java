package bai1;

public class Main1 {
    public static void main(String[] args) {
        Student mangsv = new Student();
        mangsv.declareInformation();
        studentPrinting(mangsv);
    }

    public static void studentPrinting(Student mangsv) {
        System.out.println("Ma sinh vien: "+mangsv.id);
        System.out.println("Ho va ten sinh vien: "+mangsv.Name);
        System.out.println("Sinh vien lop: "+mangsv.Class);
        System.out.println("Sinh vien nganh: "+mangsv.LockUp);
        System.out.println("-----------------------------------------");
        System.out.println(mangsv);
    }
}
