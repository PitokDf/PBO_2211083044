package Karyawan.Model;

public class Gaji {
    private int bulan;
    private int tahun;
    private Karyawan karyawan;
    private double gajiPokok;
    private double tunjanganAnak;
    private double tunjanganIstri;
    private double totalGaji;
    public Gaji(int bulan, int tahun, Karyawan karyawan, double gajiPokok, double tunjanganAnak, double tunjanganIstri,
            double totalGaji) {
        this.bulan = bulan;
        this.tahun = tahun;
        this.karyawan = karyawan;
        this.gajiPokok = gajiPokok;
        this.tunjanganAnak = tunjanganAnak;
        this.tunjanganIstri = tunjanganIstri;
        this.totalGaji = totalGaji;
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
    public Karyawan getKaryawan() {
        return karyawan;
    }
    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public double getTunjanganAnak() {
        return tunjanganAnak;
    }
    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }
    public double getTunjanganIstri() {
        return tunjanganIstri;
    }
    public void setTunjanganIstri(double tunjanganIstri) {
        this.tunjanganIstri = tunjanganIstri;
    }
    public double getTotalGaji() {
        return totalGaji;
    }
    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }
    
}
