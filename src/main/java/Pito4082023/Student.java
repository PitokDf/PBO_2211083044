package Pito4082023;

public class Student extends Person {
    public Student(){ 
        super("Ali","Padang");
        System.out.println("Inside Student : Constructor"); 
    //beberapa kode di sini 
    } 
    // beberapa kode di sini
    public static void main( String[] args ){ 
        Student anna = new Student();
        System.out.println("Nama     : "+anna.name);
        System.out.println("Alamat   : "+anna.address);

    } 
    @Override
    public String getName(){ 
        System.out.println("Student: getName");
        return name; 
    }   
}
