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
public class InputBuffer {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int number1;
        int number2;
        int number3;
        
        try{
            System.out.print("Masukkan angka pertama : ");
            number1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan angka pertama : ");
        }catch(IOException ex ){
            System.out.println("Error!");
        } 
    }
}
