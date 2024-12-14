import java.net.*;
import java.io.*;

public class Inet {

    public static void displayLocalHostInfo() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Hostname: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void displayHostInfo(String host) {
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println("Hostname: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void displayAllHostInfo(String host) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for (InetAddress address : addresses) {
                System.out.println("Hostname: " + address.getHostName());
                System.out.println("IP Address: " + address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter a hostname (or 'localhost' to get local host info): ");
            String host = reader.readLine();
            switch (host) {
                case "localhost":
                    displayLocalHostInfo();
                    break;
                case "titan":
                case "jupiter":
                case "cnn.com":
                    displayAllHostInfo(host);
                    break;
                default:
                    displayHostInfo(host);
                    break;
            }
        }
    }
}
