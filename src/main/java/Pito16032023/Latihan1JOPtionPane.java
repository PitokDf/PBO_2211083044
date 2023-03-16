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

public class Latihan1JOPtionPane {
public static void main(String[] args) {
int number = 0;
char letter = ' ';
boolean result = false;
String str = "";

        number = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Number : "));
        letter = JOptionPane.showInputDialog("Masukkan Letter : ").charAt(0);
        result = Boolean.parseBoolean(JOptionPane.showInputDialog("Masukkan nilai result (true/false) : "));
        str = JOptionPane.showInputDialog("Masukkan sebuah str : ");
        JOptionPane.showMessageDialog(null, "Number : " + number+"\nletter : "+letter+"\nresult : "+result+" \nString : "+str);
}
}
