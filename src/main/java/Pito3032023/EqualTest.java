/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito3032023;

/**
 *
 * @author Pitok
 */
public class EqualTest {
    public static void main(String[] args){
        String str1, str2, str3;
        str1 = "Free the Bound Periodicals";
        str2 = str1;
        
        System.out.println("String : "+str1);
        System.out.println("String2 : "+str2);
        System.out.println("Some object? "+ (str1==str2));
        
        str2 = new String(str1);
        
        System.out.println("String1 : "+str1);
        System.out.println("String2 : "+str2);
        System.out.println("Some object?"+(str1==str2));
        System.out.println("Some value? "+(str1.equals(str2)));
    }
}
