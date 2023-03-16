/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito16032023;

/**
 *
 * @author Pitok
 */
import javax.swing.JOptionPane;

public class Latihan3JOptionPane {
    public static void main(String[] args){
        int number1;
        int number2;
        int number3;
        int max;
        
        // Meminta pengguna memasukkan tiga buah bilangan bulat menggunakan JOptionPane
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Kedua"));
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Ketiga"));
        
        // Mencari nilai maksimum dari ketiga bilangan
        max = (number1>number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
        
        // Menampilkan nilai maksimum menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Nilai Max: " + max);
    }
}

