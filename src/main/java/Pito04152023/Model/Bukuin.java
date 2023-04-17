package Pito04152023.Model;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Bukuin {
    private String kode;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahunterbit;

    public Bukuin(){

    }
    public Bukuin(String kode, String judul, String pengarang, String penerbit, String tahunterbit){
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunterbit = tahunterbit; 
    }
    //mutator
    public void setKode(String kode){
        this.kode = kode;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    public void setTahunterbir(String tahunterbit){
        this.tahunterbit = tahunterbit;
    }
    //accessor
    public String getKode(){
        return kode;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public String getTahunterbit(){
        return tahunterbit;
    }
}
