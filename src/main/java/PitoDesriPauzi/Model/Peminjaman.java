package PitoDesriPauzi.Model;

public class Peminjaman {
    private Anggota agg;
    private String kodeagg;
    private String nama;
    private String kodebuku;
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKemabli;

    public Peminjaman() {
    }

    public Peminjaman(Anggota agg, String kodeagg, String nama, String kodebuku, Buku buku, String tanggalPinjam,
            String tanggalKemabli) {
        this.agg = agg;
        this.kodeagg = kodeagg;
        this.nama = nama;
        this.kodebuku = kodebuku;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKemabli = tanggalKemabli;
    }

    public Anggota getAgg() {
        return agg;
    }

    public void setAgg(Anggota agg) {
        this.agg = agg;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKemabli() {
        return tanggalKemabli;
    }

    public void setTanggalKemabli(String tanggalKemabli) {
        this.tanggalKemabli = tanggalKemabli;
    }

    public String getKodeagg() {
        return kodeagg;
    }

    public void setKodeagg(String kodeagg) {
        this.kodeagg = kodeagg;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }
}
