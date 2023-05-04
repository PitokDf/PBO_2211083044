package Pito1042023;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BukuAlamatjOption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<EntryBukuAlamat> bukuAlamatList = new ArrayList<>();
        
        boolean berjalan = true;
        while (berjalan) {
            int pilihan;
            pilihan = Integer.parseInt(JOptionPane.showInputDialog("=======================\n                      Menu         \n=======================\n 1. Tambah Data \n 2. Hapus Data \n 3. Tampilkan Data \n 4. Update Data \n 5. Jumlah Data \n 6. Keluar \n=======================\n Pilihan : "));
            
            if (pilihan==1) {
                    if (bukuAlamatList.size() < 100) {
                        String nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                        String alamat = JOptionPane.showInputDialog("Masukkan Alamat : ");
                        String nomorTelepon = JOptionPane.showInputDialog("Masukkan Nomor Telepon : ");
                        String alamatEmail = JOptionPane.showInputDialog("Masukkan Alamat Email : ");

                        EntryBukuAlamat bukuAlamat =  EntryBukuAlamat(nama, alamat, nomorTelepon, alamatEmail);
                        bukuAlamatList.add(bukuAlamat);
                        JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan :-)");
                        System.out.println("\n");
                    } else {
                        JOptionPane.showMessageDialog(null,"Data Telah Penuh");
                    }
                }
            else if(pilihan==2){
                
                int nomorDataHapus = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
                
                if (nomorDataHapus < 1 || nomorDataHapus > bukuAlamatList.size()) {
                        JOptionPane.showMessageDialog(null, "Nomor Data Tidak Valid");
                } else {
                    bukuAlamatList.remove(nomorDataHapus-1);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Data dihapus",nomorDataHapus);
                 }
            }
                    
            
            else if(pilihan==3){
                if (bukuAlamatList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Tidak Ada Data", "Kosong", pilihan);
                } else {
                    System.out.println("Data BukuAlamat : ");
                    for (int i = 0; i < bukuAlamatList.size(); i++) {
                        EntryBukuAlamat bukuAlamat = bukuAlamatList.get(i);
                        JOptionPane.showMessageDialog(null, "Data ke-"+(i+1)+"\nNama          : "+bukuAlamat.getNama()+"\nAlamat        : "+bukuAlamat.getAlamat()+"\nNomor Telepon : "+bukuAlamat.getNomorTelepon()+"\nAlamat Email  : "+bukuAlamat.getAlamatEmail());
                    }
                }
            }

            else if(pilihan==6){
                JOptionPane.showMessageDialog(null, "Sayonara", "Program Selesai", pilihan);
                berjalan = false;
            }
                    /*break;
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
                    System.out.println("Sayonara\n");
                    break;
                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("Pilihan tidak valid");
                    System.out.println("-------------------------------------------");
                    System.out.println("\n");
            }*/
        }
    }
    private static EntryBukuAlamat EntryBukuAlamat(String nama, String alamat, String nomorTelepon,
            String alamatEmail) {
        return null;
    }
    public static void Menu(){
        Scanner in = new Scanner(System.in);
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
    }
}


