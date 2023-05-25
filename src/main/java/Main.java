import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String jamMasuk = "12:12";
        String jamKeluar = "15:00";

        DateFormat format = new SimpleDateFormat("HH:mm");

        try {
            Date dateMasuk = format.parse(jamMasuk);
            Date dateKeluar = format.parse(jamKeluar);

            long selisihMillis = dateKeluar.getTime() - dateMasuk.getTime();
            long selisihMenit = selisihMillis / (60 * 1000);

            double selisihJam = Math.ceil(selisihMenit / 60.0);

            System.out.println("Lama Parkir: " + selisihJam + " jam");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}