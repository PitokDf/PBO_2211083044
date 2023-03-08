/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito07032023;

/**
 *
 * @author Pitok
 */
public class TestAND {
    public static void main (String[] args){
        int i = 0;
        int j = 10;
        boolean test = false;
        
        //demontrasi &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //Demonstrasi &
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
    }
}
