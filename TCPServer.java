import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        try {
            serverSocket = new ServerSocket(9876);
            System.out.println("TCP Server is running...");

            clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String line;
            int wordCount = 0;
            while ((line = in.readLine()) != null) {
                if (line.equals("xxxx")) {
                    break;
                }
                wordCount += line.split("\\s+").length;
            }

            out.println("Total word count: " + wordCount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (clientSocket != null && !clientSocket.isClosed()) {
                    clientSocket.close();
                }
                if (serverSocket != null && !serverSocket.isClosed()) {
                    serverSocket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
