/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito16032023;
import javax.swing.JOptionPane;
/**
 *
 * @author Pitok
 */
public class Latihan2JOptionPane {
    public static void main(String[] args){
        int number1;
        int number2;
        int number3;
        int average;
        
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Kedua"));
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Ketiga"));
        
        average = (number1 + number2 + number3)/3;
        
        JOptionPane.showMessageDialog(null, "Nilai Rata-Rata : " + average);
    }
}
