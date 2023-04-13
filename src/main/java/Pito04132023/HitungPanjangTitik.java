/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04132023;

/**
 *
 * @author Pitok
 */
import java.util.*;
public class HitungPanjangTitik {
    private double x1; 
    private double x2; 
    private double y1; 
    private double y2; 
    public HitungPanjangTitik(double x1, double x2, double y1, double y2){ 
        this.x1 = x1; 
        this.x2 = x2; 
        this.y1 = y1; 
        this.y2 = y2; 
    } 
    public double getLength(){ 
        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)* (y2-y1)); 
        return length; 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan x1, y1, x2, y2 : ");int x1 = in.nextInt(); int y1 = in.nextInt();
        int x2 = in.nextInt(); int y2 = in.nextInt();
        HitungPanjangTitik ht = new HitungPanjangTitik(x1, x2, y1, y2);
        
        System.out.println("Panjang Garis : "+ht.getLength());
    }
}
