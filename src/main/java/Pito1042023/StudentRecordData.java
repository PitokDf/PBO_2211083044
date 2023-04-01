package Pito1042023;

public class StudentRecordData {
    public static void main(String[] args){
        StudentRecord dataSiswa[] = new StudentRecord[100];
        StudentRecord d1 = new StudentRecord();
        d1.setName("Ani");
        d1.setAddres("padang");
        d1.setAge(34);
        dataSiswa[0]=d1;

        System.out.println(dataSiswa[0].getName());
        
        d1.setName("");
        d1.setAddres("");
        d1.setAge(34);
        dataSiswa[0]=d1;

        System.out.println(dataSiswa[0].getName());
    }
}
