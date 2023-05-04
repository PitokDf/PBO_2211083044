package Pito04152023.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam : ");
        String tglp = in.nextLine();
        System.out.print("Masukkan Tanggal kembali : ");
        String tglk = in.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate tgl1 = LocalDate.parse(tglp, formatter);
        System.out.println(tgl1);
        LocalDate tgl2 = LocalDate.parse(tglk, formatter);

        long denda = ChronoUnit.DAYS.between(tgl1, tgl2);
        long bayar = denda*500;
        System.out.println(denda);
        System.out.println(bayar);

    }

}
