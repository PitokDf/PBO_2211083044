package Karyawan.Model;

import java.util.List;

public class Gaji {
    private Karyawan karyawan;
    private int bulan;
    private int tahun;
    private double gajiPokok;
    private double tunjanganAnak;
    private double tunjanganIstri;
    private double totalGaji;

    public Gaji() {
    }

    public Gaji(Karyawan karyawan, int bulan, int tahun) {
        this.karyawan = karyawan;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public double getTunjanganAnak() {
        if (karyawan.getStatusNikah().equals("Single")) {
            tunjanganAnak = 0;
        } else if (karyawan.getStatusNikah().equals("Cerai")) {
            tunjanganAnak = (0.3 * gajiPokok * karyawan.getJumlahAnak());
        } else {
            tunjanganAnak = (0.2 * gajiPokok * karyawan.getJumlahAnak());
        }
        return tunjanganAnak;
    }

    public double getTunjanganIstri() {
        if (karyawan.getStatusNikah().equals("Single")) {
            tunjanganIstri = 0;
        } else if (karyawan.getStatusNikah().equals("Cerai")) {
            tunjanganIstri = 0;
        } else {
            tunjanganIstri = (0.2 * gajiPokok);
        }
        return tunjanganIstri;
    }

    public double getTotalGaji() {
        return (gajiPokok + tunjanganAnak + tunjanganIstri);

    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public void setTotalGaji() {
        this.totalGaji = tunjanganAnak + tunjanganIstri + gajiPokok;
    }

    public double getGajiPokok() {
        if (karyawan.getGolongan().equals("A")) {
            gajiPokok = 5000000;
        } else if (karyawan.getGolongan().equals("B")) {
            gajiPokok = 4000000;
        } else if (karyawan.getGolongan().equals("C")) {
            gajiPokok = 3000000;
        } else if (karyawan.getGolongan().equals("D")) {
            gajiPokok = 2000000;
        } else {
            gajiPokok = 0;
        }
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public void setTunjanganIstri(double tunjanganIstri) {
        this.tunjanganIstri = tunjanganIstri;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }
}
