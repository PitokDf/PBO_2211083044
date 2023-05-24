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

    public Gaji(Karyawan karyawan, int bulan, int tahun, double gajiPokok, double tunjanganAnak, double tunjanganIstri,
            double totalGaji) {
        this.karyawan = karyawan;
        this.bulan = bulan;
        this.tahun = tahun;
        this.gajiPokok = gajiPokok;
        this.tunjanganAnak = tunjanganAnak;
        this.tunjanganIstri = tunjanganIstri;
        this.totalGaji = totalGaji;
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

    public double getGajiPokok() {
        KaryawanDaoImpl karyawanDao = new KaryawanDaoImpl();
        int index = 0;
        Karyawan karyawan = karyawanDao.getKaryawan(index);
        String golongan = karyawan.getGolongan();
        if (golongan == "A") {
            return gajiPokok = 5000000;
        } else if (golongan == "B") {
            return gajiPokok = 4000000;
        } else if (golongan == "C") {
            return gajiPokok = 3000000;
        } else if (golongan == "D") {
            return gajiPokok = 2000000;
        } else {
            return gajiPokok = 0;
        }
    }

    public double getTunjanganAnak() {
        KaryawanDaoImpl karyawanDao = new KaryawanDaoImpl();
        int index = 0;
        Karyawan karyawan = karyawanDao.getKaryawan(index);
        String Status = karyawan.getStatusNikah();
        int jumlahAnak = karyawan.getJumlahAnak();

        if (Status == "Single") {
            return tunjanganAnak = 0;
        } else {
            return tunjanganAnak = (0.1 * gajiPokok * jumlahAnak);
        }
    }

    public double getTunjanganIstri() {
        KaryawanDaoImpl karyawanDao = new KaryawanDaoImpl();
        int index = 0;
        Karyawan karyawan = karyawanDao.getKaryawan(index);
        String Status = karyawan.getStatusNikah();
        if (Status == "Single") {
            return tunjanganIstri = 0;
        } else {
            return tunjanganIstri = (0.2 * gajiPokok);
        }
    }

    public double getTotalGaji() {
        return (gajiPokok + tunjanganAnak + tunjanganIstri);

    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
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
