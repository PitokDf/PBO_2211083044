package Pito4082023;

public class Person {
    protected String name;
    protected String address;

    public Person(){
        System.out.println("inside person : Construktor");
    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    /** 
    * Method accessor 
    */ 
    public String getName(){ 
        System.out.println("Person: getName");
        return name; 
    } 
    public String getAddress(){ 
        return address; 
    } 
    public void setName( String name ){ 
        this.name = name; 
    } 
    public void setAddress( String add ){ 
        this.address = add; 
    } 
}
