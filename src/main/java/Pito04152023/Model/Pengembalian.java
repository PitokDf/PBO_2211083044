package Pito04152023.Model;

public class Pengembalian {
    private Anggota anggota;
    private Bukuin buku;
    private Peminjaman1 peminjaman;
    private long terlambat;
    private long denda;

    public Pengembalian() {

    }

    public Pengembalian( Peminjaman1 peminjaman, long terlambat, long denda) {
        // this.anggota = anggota;
        // this.buku = buku;
        this.terlambat = terlambat;
        this.denda = denda;
        this.peminjaman = peminjaman;
    }

    // mutator
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public void setBukuin(Bukuin buku) {
        this.buku = buku;
    }

    public void setPeminjaman(Peminjaman1 peminjaman) {
        this.peminjaman = peminjaman;
    }

    public void setTerlambat(long terlambat) {
        this.terlambat = terlambat;
    }

    public void setdenda(long denda) {
        this.denda = denda;
    }

    // accessor
    public Anggota getAnggota() {
        return anggota;
    }

    public Bukuin getBukuin() {
        return buku;
    }

    public long getTerlambat() {
        return terlambat;
    }

    public long getDenda() {
        return denda;
    }

    public Peminjaman1 getPeminjaman() {
        return peminjaman;
    }

    public void setTglpinjam(String text) {
        
    }

    public void setTglkembali(String text) {
    }
}
