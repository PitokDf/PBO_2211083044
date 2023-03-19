/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito18032023;

/**
 *
 * @author Pitok
 */
public class Latihan771WhileLoop {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        // while-loop
        System.out.println("while-loop:");
        int i = 0;
        while (i < daysOfWeek.length) {
            System.out.println(daysOfWeek[i]);
            i++;
        }

        // do-while loop
        System.out.println("do-while loop:");
        int j = 0;
        do {
            System.out.println(daysOfWeek[j]);
            j++;
        } while (j < daysOfWeek.length);

        // for-loop
        System.out.println("for-loop:");
        for (int k = 0; k < daysOfWeek.length; k++) {
            System.out.println(daysOfWeek[k]);
        }
    }
}
