package Pito16032023;
import javax.swing.JOptionPane;//import package JOptionPane
public class Latihan611JOptionPane {//class
    public static void main(String[] args){//main
        int n1=0,n2=0,n3=0;//inisialisasikan n1,n2,n3 dengan tipe data integer
        float rata;//inisialisasi rata dengan tipe data float

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama"));//input n1
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama"));//input n2
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama"));//input n3

        rata = (n1+n2+n3)/3;
        if(rata>=60)//jika rata besar sama dengan 60
            JOptionPane.showMessageDialog(null,":-)");//maka output senyum
        else//jika rata kecil dari 60
            JOptionPane.showMessageDialog(null, ":-( ");//maka output sedih
    }//end main
}//end class Latihan611JOptionPane
