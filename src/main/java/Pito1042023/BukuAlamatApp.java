package Pito1042023;

import java.util.ArrayList;
import java.util.Scanner;

public class BukuAlamatApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<EntryBukuAlamat> bukuAlamatList = new ArrayList<>();
        
        boolean berjalan = true;
        while (berjalan) {
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
            
            switch (pilihan) {
                case 1:
                    if (bukuAlamatList.size() < 100) {
                        System.out.print("Masukkan Nama          : ");
                        String nama = in.nextLine();

                        System.out.print("Masukkan Alamat        : ");
                        String alamat = in.nextLine();

                        System.out.print("Masukkan Nomor Telepon : ");
                        String nomorTelepon = in.nextLine();

                        System.out.print("Masukkan Alamat Email  : ");
                        String alamatEmail = in.nextLine();
                        
                        EntryBukuAlamat bukuAlamat = new EntryBukuAlamat(nama, alamat, nomorTelepon, alamatEmail);
                        bukuAlamatList.add(bukuAlamat);
                        System.out.println("Data berhasil ditambahkan :-)");
                        System.out.println("\n");
                    } else {
                        System.out.println("-------------------------------------------");
                        System.out.println("Data Telah Penuh X ");
                        System.out.println("-------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.print("nomor data yang ingin dihapus : ");
                    int nomorDataHapus = in.nextInt();
                    in.nextLine();
                    if (nomorDataHapus < 1 || nomorDataHapus > bukuAlamatList.size()) {
                        System.out.println("-------------------------------------------");
                        System.out.println("Nomor data tidak valid");
                        System.out.println("-------------------------------------------");
                        System.out.println("");
                    } else {
                        bukuAlamatList.remove(nomorDataHapus-1);
                        System.out.println("-------------------------------------------");
                        System.out.println("Data berhasil dihapus :-)");
                        System.out.println("-------------------------------------------");
                        System.out.println("");
                    }
                    break;
                case 3:
                    if (bukuAlamatList.isEmpty()) {
                        System.out.println("-------------------------------------------");
                        System.out.println("Tidak ada data");
                        System.out.println("-------------------------------------------");
                    } else {
                        System.out.println("Data BukuAlamat : ");
                        for (int i = 0; i < bukuAlamatList.size(); i++) {
                            EntryBukuAlamat bukuAlamat = bukuAlamatList.get(i);
                            System.out.println("");
                            System.out.println("Data ke-" + (i+1));
                            System.out.println("-------------------------------------------");
                            System.out.println("Nama          : " + bukuAlamat.getNama());
                            System.out.println("Alamat        : " + bukuAlamat.getAlamat());
                            System.out.println("Nomor Telepon : " + bukuAlamat.getNomorTelepon());
                            System.out.println("Alamat Email  : " + bukuAlamat.getAlamatEmail());
                            System.out.println("-------------------------------------------");
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor data yang ingin diUpdate : ");
                    int nomorDataPerbarui = in.nextInt();
                    in.nextLine();
                    if (nomorDataPerbarui < 1 || nomorDataPerbarui > bukuAlamatList.size()) {
                        System.out.println("-------------------------------------------");
                        System.out.println("Nomor data tidak valid");
                        System.out.println("-------------------------------------------");
                        System.out.println("\n");
                    } else {
                        System.out.print("Update Nama          : ");
                        String namaPerbarui = in.nextLine();

                        System.out.print("Update Alamat        : ");
                        String alamatPerbarui = in.nextLine();

                        System.out.print("Update Nomor Telepon : ");
                        String nomorTeleponPerbarui = in.nextLine();

                        System.out.print("Update Alamat Email  : ");
                        String alamatEmailPerbarui = in.nextLine();
                        System.out.println("");
                        EntryBukuAlamat bukuAlamatPerbarui = new EntryBukuAlamat(namaPerbarui, alamatPerbarui, nomorTeleponPerbarui, alamatEmailPerbarui);
                        bukuAlamatList.set(nomorDataPerbarui-1, bukuAlamatPerbarui);
                        System.out.println("-------------------------------------------");
                        System.out.println("Data berhasil diperbarui");
                        System.out.println("-------------------------------------------");
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Jumlah buku Alamat : " + bukuAlamatList.size());
                    System.out.println("-------------------------------------------\n");
                    break;
                case 6:
                    berjalan = false;
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


