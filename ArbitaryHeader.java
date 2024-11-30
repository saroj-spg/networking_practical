import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class ArbitaryHeader {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String name = "http://spm.com.np/";
        URI uri = new URI(name);
        URL url = uri.toURL();
        URLConnection conn = url.openConnection();
        String ct = conn.getHeaderField("Content-Type");
        String cl = conn.getHeaderField("Content-Length");
        String lm = conn.getHeaderField("Last-Modified");

        System.out.println("content type is:" + ct);
        System.out.println("Content Length is:" + cl);
        System.out.println("last modified is:" + lm);
    }
}
