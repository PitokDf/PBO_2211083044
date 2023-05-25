package UTS_A.Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import Karyawan.Model.Karyawan;

public class Warnet {
    private Pelanggan pelanggan;
    private String TglMasuk;
    private String jamMasuk;
    private String jamKeluar;
    private double tarif;
    private double totalBayar;

    public Warnet() {
    }

    public Warnet(Pelanggan pelanggan, String tglMasuk, String jamMasuk, String jamKeluar) {
        this.pelanggan = pelanggan;
        this.TglMasuk = tglMasuk;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
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
        tarif =10000 * lama();
        return tarif;
    }

    public double getTotalBayar() {
        if (pelanggan.getJenisPelanggan().equals("VIP")) {
            totalBayar = tarif - tarif * 0.02;
            return totalBayar;
        }
        totalBayar = tarif - tarif * 0.05;
            return totalBayar;
    }

    public double lama() {
        DateFormat format = new SimpleDateFormat("HH:mm");

        try {
            Date dateMasuk = format.parse(jamMasuk);
            Date dateKeluar = format.parse(jamKeluar);
            long selisihMillis = dateKeluar.getTime() - dateMasuk.getTime();
            long selisihMenit = selisihMillis / (60 * 1000);
            double selisihJam = Math.ceil(selisihMenit / 60.0);
            return selisihJam;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
}
