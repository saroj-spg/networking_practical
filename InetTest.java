
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
    public static void main(String[] args) {
        try {
            /*
             * InetAddress i = InetAddress.getByName("www.abc.com");
             * InetAddress i2 = InetAddress.getByName("abc.com");
             * boolean b = i.equals(i2);
             * 
             * System.out.println(b);
             */

        } catch (

        UnknownHostException e) {
            System.err.println("error:" + e.getMessage());
        }
    }
}
