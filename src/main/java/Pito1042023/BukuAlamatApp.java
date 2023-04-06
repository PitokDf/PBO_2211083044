package Pito1042023;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class BukuAlamatApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EntryBukuAlamat tempik;
        EntryBukuAlamat[] saya = new EntryBukuAlamat[100];
        
        boolean berjalan = true;
        while (berjalan) {
            tempik = new EntryBukuAlamat();
            System.out.println("=======================");
            System.out.println("          Menu         ");
            System.out.println("=======================");
            System.out.println(" 1. Tambah data        ");
            System.out.println(" 2. Hapus Data         ");
            System.out.println(" 3. Tampilkan data     ");
            System.out.println(" 4. Update Data        ");
            System.out.println(" 5. Jumhlah Data       ");
            System.out.println(" 6. Keluar             ");
            System.out.println("=======================");
            System.out.print("Pilihan: ");
            int pilihan = in.nextInt();
            in.nextLine();
            System.out.println("\n");
            int i =0;
            switch (pilihan) {
                case 1:
                        System.out.print("Masukkan Nama          : ");
                        String nama = in.nextLine();

                        System.out.print("Masukkan Alamat        : ");
                        String alamat = in.nextLine();

                        System.out.print("Masukkan Nomor Telepon : ");
                        String nomorTelepon = in.nextLine();

                        System.out.print("Masukkan Alamat Email  : ");
                        String alamatEmail = in.nextLine();
                        
                        tempik.setNama(nama);tempik.setAlamat(alamat);tempik.setNomorTelepon(nomorTelepon);tempik.setAlamatEmail(alamatEmail);
                        saya[i++]= tempik;
                        System.out.println("Data berhasil ditambahkan :-)");
                        System.out.println("\n");
                    break;
                case 2:
                    System.out.print("nomor data yang ingin dihapus : ");
                    int nomorDataHapus = in.nextInt();
                    in.nextLine();
                    tempik.setNama("");tempik.setAlamat("");tempik.setNomorTelepon("");tempik.setAlamatEmail("");
                    saya[i]= tempik;
                    System.out.println("Data berhasil ditambahkan :-)");
                    System.out.println("\n");
                    break;
                case 3:
                    if (i < 0 ) {
                        System.out.println("-------------------------------------------");
                        System.out.println("Tidak ada data");
                        System.out.println("-------------------------------------------");
                    } else {
                        System.out.println("Data BukuAlamat : ");
                        for (int j = 0; j <= i; j++){
                            
                            System.out.println("");
                            System.out.println("Data ke-" + (j+1));
                            System.out.println("-------------------------------------------");
                            System.out.println("Nama          : " + saya[j].getNama());
                            System.out.println("Alamat        : " + saya[j].getAlamat());
                            System.out.println("Nomor Telepon : " + saya[j].getNomorTelepon());
                            System.out.println("Alamat Email  : " + saya[j].getAlamatEmail());
                            System.out.println("-------------------------------------------");
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                
                System.out.println("Masukkan index data yang ingin diedit : ");int k = in.nextInt();
                in.nextLine();
                System.out.print("Masukkan Nama          : ");
                nama = in.nextLine();

                System.out.print("Masukkan Alamat        : ");
                alamat = in.nextLine();

                System.out.print("Masukkan Nomor Telepon : ");
                nomorTelepon = in.nextLine();

                System.out.print("Masukkan Alamat Email  : ");
                alamatEmail = in.nextLine();
                
                tempik.setNama(nama);tempik.setAlamat(alamat);tempik.setNomorTelepon(nomorTelepon);tempik.setAlamatEmail(alamatEmail);
                saya[k]= tempik;
                System.out.println("Data berhasil ditambahkan :-)");
                System.out.println("\n");
                    break;
                case 5:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Jumlah buku Alamat : " + i);
                    System.out.println("-------------------------------------------\n");
                    break;
                case 6:
                    berjalan = false;
                    System.out.println("Sayonara\n");
                    break;
                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("Pilihan tidak valid");
                    System.out.println("-------------------------------------------");
                    System.out.println("\n");
            }
        }
    }
}


