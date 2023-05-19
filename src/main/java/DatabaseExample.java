import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/People";
        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            // Lakukan operasi database di sini menggunakan objek koneksi
            // ...
            connection.close(); // Jangan lupa untuk menutup koneksi setelah selesai
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
