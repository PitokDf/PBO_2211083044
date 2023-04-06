package Pito1042023;

public class StudentRecordA {
    private String Nama;
    private String Address;
    private String Age;
    private int NilaiMTK;
    private int NilaiIPA;
    private int NIlaiInggris;
    
    public StudentRecordA(){
        //area inisialisasi kode
    }
    public String getNama(){
        return Nama;
    }
    public String getAddres(){
        return Address;
    }
    public String getAge(){
        return Age;
    }
    public int setNilaiMTK(){
        return NilaiMTK;
    }
    public int setNilaiIPA(){
        return NilaiIPA;
    }public int setNilaiInggris(){
        return NIlaiInggris;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setAddres(String Addres){
        this.Address = Addres;
    }
    public void setNilaiInggris(int NIlaiInggris){
        this.NIlaiInggris = NIlaiInggris;
    }
    public void setNilaiMTK(int NilaiMTK){
        this.NilaiMTK = NilaiMTK;
    }
    public void setNilaiIPA(int NilaiIPA){
        this.NilaiIPA = NilaiIPA;
    }

    public int getrata(int NIlaiInggris, int NilaiIPA, int NilaiMTK){
        return (NilaiIPA+NilaiMTK+NIlaiInggris)/3;
    }
    public void setAge(String Age){
        this.Age = Age;
    }
    public String getNilaiHuruf(int getrata){
        if(getrata>80){
            return "A";
        }else if(getrata>65){
            return "B";
        }else if(getrata>55){
            return "c";
        }else if(getrata>45){
            return "d";
        }
        else{
            return "E";
        }
    }
}
