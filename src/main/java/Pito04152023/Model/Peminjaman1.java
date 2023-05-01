package Pito04152023.Model;

public class Peminjaman1 {
    private Anggota anggota;
    private Bukuin bukuin;
    private String tglpinjam;
    private String tglkembali;

    public Peminjaman1() {
    }

    public Peminjaman1(Anggota anggota, Bukuin bukuin, String tglpinjam, String tglkembali) {
        this.anggota = anggota;
        this.bukuin = bukuin;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public void setBukuin(Bukuin buku) {
        this.bukuin = buku;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Bukuin getBukuin() {
        return bukuin;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }
}
