package Pito04152023.Model;

import javax.swing.JTextField;

public class Anggota {
    private String nobp;
    private String nama;
    private String alamat;

    public Anggota (){

    }

    public Anggota(String nobp, String nama, String alamat){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNobp(){
        return nobp;
    }
    public void setNobp(String string){
        this.nobp = string;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
