package UTS_A.Model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Warnet {
    private Pelanggan pelanggan;
    private String TglMasuk;
    private String jamMasuk;
    private String jamKeluar;
    private double tarif;
    private double totalBayar;

    public Warnet() {
    }

    public Warnet(Pelanggan pelanggan, String tglMasuk, String jamMasuk, String jamKeluar, double tarif) {
        this.pelanggan = pelanggan;
        TglMasuk = tglMasuk;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.tarif = tarif;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getTglMasuk() {
        return TglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        TglMasuk = tglMasuk;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public String getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(String jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        LocalTime waktuAwal = LocalTime.parse(getJamMasuk(), DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime waktuPengurang = LocalTime.parse(getJamKeluar(), DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime selisih = waktuAwal.minusHours(waktuPengurang.getHour()).minusMinutes(waktuPengurang.getMinute());

        // Mendapatkan nilai jam dari hasil pengurangan
        int hasil = selisih.getHour();
        double harga = 5000 * hasil;
        tarif = harga;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
}
