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
public class Latihan2Buffer {
    public static void main(String[] args){
        int number1;
        int number2;
        int number3;
        int average;
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan Nilai 1 : ");
            number1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai 2 : ");
            number2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai 3 : ");
            number3 = Integer.parseInt(dataIn.readLine());
            
            
            average = (number1 + number2 + number3)/3;
            System.out.print("Nilai Rata-Rata : "+average);
        }catch (IOException ex){
            System.out.println("Terjadi kesalahan saat membaca input dari pengguna: " + ex.getMessage());
        }
    }
}
