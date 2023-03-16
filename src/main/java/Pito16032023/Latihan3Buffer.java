/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito16032023;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Pitok
 */
public class Latihan3Buffer {
    public static void main(String[] args){
        int number1;
        int number2;
        int number3;
        int max;
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Masukkan Nilai Pertama : ");
            number1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai Pertama : ");
            number2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai Pertama : ");
            number3 = Integer.parseInt(dataIn.readLine());
            
            max = (number1>number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
            System.out.print("Nilai Max : "+max);
        }catch(IOException ex){
            
        }
    }
}
