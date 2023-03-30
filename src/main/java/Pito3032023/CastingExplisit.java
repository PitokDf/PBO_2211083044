/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito3032023;

/**
 *
 * @author Pitok
 */
public class CastingExplisit {
    public static void main(String[] args){
        char valChar = 'A';
        int valInt = valChar;
        
        double valDouble = 10.12;
        valInt =(int)valDouble;
        double x = 10.2;
        int y =2 ;
        
        int result = (int)(x/y);
        System.out.println(valInt);//casting explisit: keluaran 97
        System.out.println(result);
    }
}
