/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito18032023;

/**
 *
 * @author Pitok
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Latihan772 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1));
            numbers[i] = Integer.parseInt(input);
        }

        int maxInput = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxInput) {
                maxInput = numbers[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Input terbesar adalah: " + maxInput);
    }
}
