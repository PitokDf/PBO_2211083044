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
public class ContohJOptionPane {
   public static void main(String[] args){
       String nm;
       nm = JOptionPane.showInputDialog("Please enter your name");
       String msg = ("Hello "+ nm+"!!");
       JOptionPane.showMessageDialog(null, msg);
   } 
}
