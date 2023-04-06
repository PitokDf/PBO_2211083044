package Pito1042023;

public class StundentRecordExample {
    public static void main(String[] args){
        StudentRecord yanto = new StudentRecord();
        StudentRecord yanti = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        

        yanto.setName("Yanto");
        yanto.setAddres("palembang");
        yanto.setAge(18);
        yanto.setEnglishGrade(90.0);
        yanto.setMathgrade(90.0);
        yanto.setscienceGrade(90);


        yanti.setName("Yanti");
        yanti.setAddres("Jakarta");
        yanti.setAge(19);

        //m
        System.out.println("Data Object Yanto");
        System.out.println("Nama   : "+yanto.getName());
        System.out.println("Alamat : "+yanto.getAddres());
        System.out.println("Umur   : "+yanto.getAge());
        System.out.println("Rata   : "+yanto.getaverage());
        //
        System.out.println("data object yanti");
        yanti.print("");
        yanti.print(70, 80, 90);
        yanti.getaverage();

        System.out.println("data object ali");
        ali.print("");
        yanto.NilaiHuruf(0);
        
        System.out.println("JUmlah data: "+StudentRecord.gst());
    }
}
