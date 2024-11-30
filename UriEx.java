

import java.net.URI;

public class UriEx {

    public static void Main(String[] args) {
        try {
            URI newuri = new URI("htttp", "www.google.com", "search1");
            System.out.println("getscheme" + newuri.getScheme());
            System.out.println("getscheme specific part" + newuri.getSchemeSpecificPart());
            System.out.println("getfragment" + newuri.getFragment());
            System.out.println("gethost" + newuri.getHost());
            System.out.println("getAuthority" + newuri.getAuthority());
            System.out.println("getscheme" + newuri.getUserInfo());
            System.out.println();
        } catch (Exception e) {

            
        }
    }
}