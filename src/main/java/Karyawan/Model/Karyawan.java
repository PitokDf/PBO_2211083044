package Karyawan.Model;

public class Karyawan extends People{
    private String nip;
    private String golongan;
    private String jabatan;
    public Karyawan(String nama, String alamat, String statusNikah, String nip, String golongan, String jabatan) {
        super(nama, alamat, statusNikah);
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
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

    
}
