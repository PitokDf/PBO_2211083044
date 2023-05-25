package UTS_A.Model;

public class Pelanggan {
    private String kodePelanggan;
    private String namaPelanggan;
    private String jenisPelanggan;

    public Pelanggan() {
    }

    public Pelanggan(String kodePelanggan, String namaPelanggan, String jenisPelanggan) {
        this.kodePelanggan = kodePelanggan;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

}
