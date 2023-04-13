/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04132023;

/**
 *
 * @author Pitok
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        
        System.out.println("10 dan 11 "+ myInteger.isEqual(10,11));
        System.out.println("10.14 dan 11.14 " + myDouble.isEqual(10.14, 11.14));
    }
}
