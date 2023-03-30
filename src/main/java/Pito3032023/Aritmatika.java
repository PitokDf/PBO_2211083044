/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito3032023;

/**
 *
 * @author Pitok
 */
public class Aritmatika {
    static int tambah(int a,int b){
        return a+b;
    }
    static boolean cekGanjil(int a){
        return (a%2==1);
    }
    static int[] ganjil(int a){
        int [] aa = new int [a];
        for (int i =0 ; i <a; i++){
            if (cekGanjil(i)){
                aa[i]= i;
            }
            
        }
        return aa;
    }
    static boolean prima(int a){
        int f =0;
        for (int i=1; i<=a; i++){
            if (a%i==0){
                f++;
            }
        }
        return (f==2);
    }
    static int[] hg(int a){
        int [] aa = new int [a];
        int i =0;
        int j =1;
        while ( i <a){
            if(prima(j)){
                aa[i] =j;
            }
            i++;
            j++;
        }
        return aa;
    }
}
