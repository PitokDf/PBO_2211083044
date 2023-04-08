package Pito4082023;

import Pito1042023.StudentRecordA;
public class StudentRecordE extends StudentRecordA{
    @Override
    public String getNama(){
        return Nama;
    }
    public static void main(String[] args){
        StudentRecordE se = new StudentRecordE();
        se.setNama("pito");
        System.out.println("Nama : "+se.getNama());
    }
}
