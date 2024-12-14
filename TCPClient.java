import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java TCPClient <filename> <server>");
            return;
        }

        String filename = args[0];
        String server = args[1];

        Socket socket = null;
        try {
            socket = new Socket(server, 9876);
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = fileReader.readLine()) != null) {
                out.println(line);
            }
            out.println("xxxx");

            String response = in.readLine();
            System.out.println("Server response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null && !socket.isClosed()) {
                    socket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
