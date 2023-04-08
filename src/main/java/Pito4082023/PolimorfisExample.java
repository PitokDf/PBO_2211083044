package Pito4082023;

public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee emp = new Employee();
        student.setName("Budi");
        student.setAddress("Padang");
        emp.setName("doni");
        student.setName("Bukit Tinggi");

        printInformation(student);
        printInformation(emp);
        /*ref = student;
        String temp = ref.getName();
        System.out.println(temp);

        ref = emp;
        String temp1 = ref.getName();
        System.out.println(temp1);*/
    }
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Student : "+p.getName());
            System.out.println("Alamat Student : "+p.getAddress());
        }else if(p instanceof Employee){
            System.out.println("Nama Employee : "+p.getName());
            System.out.println("Alamat Employee : "+p.getAddress());
        }
    }
}
