/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04132023;

/**
 *
 * @author Pitok
 */
import java.util.*;;
public class Line implements Relation{
    private double x1; 
    private double x2; 
    private double y1; 
    private double y2; 
    public Line(double x1, double x2, double y1, double y2){ 
        this.x1 = x1; 
        this.x2 = x2; 
        this.y1 = y1; 
        this.y2 = y2; 
    } 
    public double getLength(){ 
        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)* (y2-y1)); 
        return length; 
    } 

    public boolean isGreater( Object a, Object b){ 
        double aLen = ((Line)a).getLength(); 
        double bLen = ((Line)b).getLength(); 
        return (aLen > bLen); 
    } 

    public boolean isLess( Object a, Object b){ 
        double aLen = ((Line)a).getLength(); 
        double bLen = ((Line)b).getLength(); 
        return (aLen < bLen); 

    } 

    public boolean isEqual( Object a, Object b){ 
        double aLen = ((Line)a).getLength(); 
        double bLen = ((Line)b).getLength(); 
        return (aLen == bLen); 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan x1, y1, x2, y2 (Line 1): ");int x1 = in.nextInt(); int y1 = in.nextInt();
        int x2 = in.nextInt(); int y2 = in.nextInt();
        System.out.println("Masukkan x1, y1, x2, y2 (Line 2): ");int x11 = in.nextInt(); int y11 = in.nextInt();
        int x22 = in.nextInt(); int y22 = in.nextInt();
        Line ht = new Line(x1, x2, y1, y2);
        Line ht1 = new Line(x11, x22, y11, y22);
        Relation line = new Line(x1, x2, y1, y2);
        Relation line1 = new Line(x11, x22, y11, y22);
        System.out.println("Panjang Garis Line 1 : "+ht.getLength()); 
        System.out.println("Panjang Garis Line 2 : "+ht1.getLength()); 
        System.out.println("Lina A > Line B = "+line.isGreater(line, line1));
        System.out.println("Lina A < Line B = "+line.isLess(line, line1));
        System.out.println("Lina A = Line B = "+line.isEqual(line, line1));
    }
}
