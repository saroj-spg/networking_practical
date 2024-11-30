import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfacesInfo {
    public static void main(String[] args) {
        try {
            // Get all network interfaces on the local machine
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                displayInterfaceInfo(ni);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void displayInterfaceInfo(NetworkInterface ni) {
        try {
            System.out.println("******");
            System.out.println("Interface Name: " + ni.getName());
            System.out.println("Display Name: " + ni.getDisplayName());

            // Get all IP addresses bound to this network interface
            Enumeration<InetAddress> addresses = ni.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress address = addresses.nextElement();
                System.out.println("IP Address: " + address.getHostAddress());
            }

            // Get hardware (MAC) address
            byte[] mac = ni.getHardwareAddress();
            if (mac != null) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < mac.length; i++) {
                    sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                }
                System.out.println("MAC Address: " + sb.toString());
            }

            // Check if the network interface is up
            System.out.println("Is Up: " + ni.isUp());

            // Check if the network interface is a loopback interface
            System.out.println("Is Loopback: " + ni.isLoopback());

            // Check if the network interface is a virtual interface
            System.out.println("Is Virtual: " + ni.isVirtual());

            // Check if the network interface supports multicast
            System.out.println("Supports Multicast: " + ni.supportsMulticast());

            // Check if the network interface is a point-to-point interface
            System.out.println("Is Point to Point: " + ni.isPointToPoint());
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
