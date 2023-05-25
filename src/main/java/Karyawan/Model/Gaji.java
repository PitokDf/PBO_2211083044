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
        setGajiPokok(karyawan);
        setTunjanganAnak(karyawan);
        setTunjanganIstri(karyawan);
        setTotalGaji();
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
        return tunjanganAnak;
    }

    public double getTunjanganIstri() {
        return tunjanganIstri;
    }

    public double getTotalGaji() {
        return (gajiPokok + tunjanganAnak + tunjanganIstri);

    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public void setGajiPokok(Karyawan karyawan) {
        String golongan = karyawan.getGolongan();
        if (golongan == "A") {
            gajiPokok = 5000000;
        } else if (golongan == "B") {
            gajiPokok = 4000000;
        } else if (golongan == "C") {
            gajiPokok = 3000000;
        } else if (golongan == "D") {
            gajiPokok = 2000000;
        } else {
            gajiPokok = 0;
        }
    }

    public void setTunjanganAnak(Karyawan karyawan) {
        String Status = karyawan.getStatusNikah();
        int jumlahAnak = karyawan.getJumlahAnak();

        if (Status == "Single") {
            tunjanganAnak = 0;
        } else {
            tunjanganAnak = (0.1 * gajiPokok * jumlahAnak);
        }
    }

    public void setTunjanganIstri(Karyawan karyawan) {
        String Status = karyawan.getStatusNikah();
        if (Status == "Single") {
            tunjanganIstri = 0;
        } else {
            tunjanganIstri = (0.2 * gajiPokok);
        }
    }

    public void setTotalGaji() {
        this.totalGaji = tunjanganAnak + tunjanganIstri + gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
}
