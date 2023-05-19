import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) {
        String serverName = "localhost";
        int port = 80;

        try {
            Socket socket = new Socket(serverName, port);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello, server".getBytes());

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = reader.readLine();
            System.out.println("response " + response);

            socket.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
