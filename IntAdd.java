import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IntAdd {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("www.youtube.com");
        System.out.println("***" + ip + "***");
        System.out.println("HostAddress:" + ip.getHostAddress());
        System.out.println("Hostname:" + ip.getHostName());
        System.out.println("CanonicalHostname:" + ip.getCanonicalHostName());

        InetAddress[] googleaddresses = InetAddress.getAllByName("www.google.com");
        System.out.println("** Google Addresses*** " + Arrays.toString(googleaddresses));

        byte[] arr = { 72, 3, 3, 12 };
        InetAddress addr = InetAddress.getByAddress(arr);
        System.out.println("***byteadd***" + addr);
        System.out.println(":" + Arrays.toString(addr.getAddress()));
        InetAddress ip1 = InetAddress.getByName("www.youtube.com");
        System.out.println("***" + ip1 + "***");
        System.out.println("linklocaladdress:" + (ip.isAnyLocalAddress()));
        System.out.println("loopbackaddress:" + (ip.isLoopbackAddress()));
        System.out.println("linklocaladdress:" + (ip1.isLinkLocalAddress()));
        System.out.println("siteLocaladdresses:" + (ip.isSiteLocalAddress()));
        System.out.println("multicastaddresses:" + (ip.isMulticastAddress()));
        System.out.println("mclinkaddresses:" + (ip.isMCGlobal()));
        System.out.println("mcorglocal:" + (ip.isMCOrgLocal()));
        System.out.println("mcsitelocal:" + (ip.isMCSiteLocal()));
        System.out.println("mclinklocal:" + (ip.isMCLinkLocal()));
        System.out.println("mcnodelocal:" + (ip.isMCNodeLocal()));
        System.out.println("hashcode:" + (ip.hashCode()));
        System.out.println("\nip==1p1:" + (ip.equals(ip1)));

    }
}