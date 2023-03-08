/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito07032023;

/**
 *
 * @author Pitok
 */
public class Latihan3 {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        
        int max = (number1>number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
        
        System.out.println("Number 1 = "+number1);
        System.out.println("Number 3 = "+number2);
        System.out.println("Number 2 = "+number3);
        System.out.println("Nilai Terbesar = "+max);
    }
}