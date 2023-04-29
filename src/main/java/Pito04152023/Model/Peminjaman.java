/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04152023.Model;

/**
 *
 * @author Pitok
 */
public class Peminjaman {
    private Anggota anggota;
    private Bukuin buku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){}
    public Peminjaman(Anggota anggota,Bukuin buku,String tglpinjam,String tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    public void setBukuin(Bukuin buku){
        this.buku = buku;
    }
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    public void setTglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
    
    public Anggota getAnggota(){
        return anggota;
    }
    public Bukuin getBukuin(){
        return buku;
    }
    public String getTglpinjam(){
        return tglpinjam;
    }
    public String getTglkembali(){
        return tglkembali;
    }
    
}
