/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04132023;

/**
 *
 * @author Pitok
 */
public class Circle implements Relation{
    private Double Jari;
    public Circle(double Jari){ 
        this.Jari = Jari;
    } 
    public double getLength(){ 
        double length = 3.14 * Jari * Jari; 
        return length; 
    } 

    public boolean isGreater( Object a, Object b){ 
        double aLen = ((Circle)a).getLength(); 
        double bLen = ((Circle)b).getLength(); 
        return (aLen > bLen); 
    } 

    public boolean isLess( Object a, Object b){ 
        double aLen = ((Circle)a).getLength(); 
        double bLen = ((Circle)b).getLength(); 
        return (aLen < bLen); 

    } 

    public boolean isEqual( Object a, Object b){ 
        double aLen = ((Circle)a).getLength(); 
        double bLen = ((Circle)b).getLength(); 
        return (aLen == bLen); 
    }
    public static void main(String[] args){
        Relation ling = new Circle(5);
        Relation ling2 = new Circle(3);

        System.out.println(ling.isEqual(ling, ling2));
    }
}
