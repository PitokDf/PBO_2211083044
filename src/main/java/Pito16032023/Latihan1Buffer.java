/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito16032023;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Latihan1Buffer {
public static void main(String[] args) {
int number = 0;
char letter = ' ';
boolean result = false;
String str = "";
    try {
        number = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Number : "));
        letter = JOptionPane.showInputDialog("Masukkan Letter : ").charAt(0);
        result = Boolean.parseBoolean(JOptionPane.showInputDialog("Masukkan nilai result (true/false) : "));
        str = JOptionPane.showInputDialog("Masukkan sebuah str : ");

        System.out.println("Anda memasukkan nilai:");
        System.out.println("number = " + number);
        System.out.println("letter = " + letter);
        System.out.println("result = " + result);
        System.out.println("str = " + str);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengubah input menjadi bilangan bulat: " + ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
    }
}
}



