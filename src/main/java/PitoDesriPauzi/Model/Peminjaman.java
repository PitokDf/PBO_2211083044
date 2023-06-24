package PitoDesriPauzi.Model;

public class Peminjaman {
    private String kodeagg;
    private String kodebuku;
    private String tanggalPinjam;
    private String tanggalKemabli;

    public Peminjaman() {
    }

    public Peminjaman(String kodeagg, String kodebuku, String tanggalPinjam, String tanggalKemabli) {
        this.kodeagg = kodeagg;
        this.kodebuku = kodebuku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKemabli = tanggalKemabli;
    }

    public String getKodeagg() {
        return kodeagg;
    }

    public void setKodeagg(String kodeagg) {
        this.kodeagg = kodeagg;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
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

}
