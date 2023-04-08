package Pito4082023;

public class Employee extends Person{
    @Override
    public String getName(){
        System.out.println("getName Employee");
        return name;
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
