/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito3032023;

/**
 *
 * @author Pitok
 */
public class TestPassByValue {
    public static void main(String[] args){
        int i = 10;//mencetak nilai i
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    public static void test(int j){
        j = 33;
    }
}
