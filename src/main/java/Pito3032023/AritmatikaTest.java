/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito3032023;

/**
 *
 * @author Pitok
 */
public class AritmatikaTest {
    public static void main(String[] args){
        int a = 3;
        int b = 33;
        
        System.out.println("Hasil Penambahan : "+Aritmatika.tambah(a, b));
        System.out.println("Bilangan Genap : "+Aritmatika.cekGanjil(a));
        System.out.print("Bilangan Ganjil : ");
       
        System.out.println(" ");
        System.out.print("Bilangan Prima : ");
        int [] asd = Aritmatika.hg(Aritmatika.tambah(a, b));
        for (int i =0; i<asd.length;i++){
            if (asd[i]!=0)
            System.out.print(asd[i]+" ");
            
        }
    }
}
