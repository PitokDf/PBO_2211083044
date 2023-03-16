/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito16032023;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Latihan1Buffer{
    public static void main(String[] args){
        int number = 10;
        char letter = 'a';
        boolean result = true;
        String str = "Hello";
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan number : ");
            number = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan letter : ");
            letter = (char)dataIn.read();
            dataIn.readLine();
            System.out.print("Masukkan result (true/false): ");
            result = Boolean.parseBoolean(dataIn.readLine());
            System.out.print("Masukkan str : ");
            str = dataIn.readLine();
            
            
            System.out.println("Number : "+number);
            System.out.println("Letter : "+letter);
            System.out.println("Result : "+result);
            System.out.println("Str : "+str);
        }catch (IOException ex){
            System.out.println("Terjadi kesalahan saat membaca input dari pengguna: " + ex.getMessage());
        }
    }
}



