package Karyawan.Model;

import Karyawan.View.FormKaryawan;

public class Karyawan extends Person {
    private String nip;
    private String golongan;
    private String jabatan;
    private int jumlahAnak;

    public Karyawan(String nip, String golongan, String jabatan, int jumlahAnak) {
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.jumlahAnak = jumlahAnak;
    }

    public Karyawan(String nama, String alamat, String statusNikah, String nip, String golongan, String jabatan,
            int jumlahAnak) {
        super(nama, alamat, statusNikah);
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.jumlahAnak = jumlahAnak;
    }

    public Karyawan() {
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
}
