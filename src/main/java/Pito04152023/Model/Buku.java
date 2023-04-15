/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04152023.Model;

/**
 *
 * @author Pitok
 */
public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String Pengarang;
    private String Penerbit;
    private int tahunTerbit;
    
    public Buku(){
        
    }
    public Buku(String kodeBuku, String judulBuku, String Pengarang, String Penerbit, int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.Pengarang = Pengarang;
        this.Penerbit = Pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getKodeBuku(){
        return kodeBuku;
    }
    public String getJudulBuku(){
        return judulBuku;
    }
    public String getPengarang(){
        return Pengarang;
    }
    public String getPenerbit(){
        return Penerbit;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    public void setKodeBuku(String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }
    public void setPengarang(String Pengarang){
        this.Pengarang = Pengarang;
    }
    public void setPenerbit(String Penerbit){
        this.Penerbit = Penerbit;
    }
    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
}
