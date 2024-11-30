import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HeaderFieldRetrieve {

    public static void main(String[] args) throws URISyntaxException, IOException {
        String name = "https://www.youtube.com/";
        URI uri = new URI(name);
        URL url = uri.toURL();
        URLConnection conn = url.openConnection();
        String content = conn.getContentType();
        int length = conn.getContentLength();
        long date = conn.getDate();
        Date date1 = new Date(date);

        System.out.println("contenttype:" + content);
        System.out.println("contentlength:" + length);
        System.out.println("Date:" + date1);
        System.out.println("Server: " + conn.getHeaderField("Server"));
        System.out.println("connection:" + conn.getHeaderField("Connection"));
        System.out.println("Server: " + conn.getHeaderField("Server"));
        System.out.println("Connection: " + conn.getHeaderField("Connection"));
        System.out.println("Cache-Control: " + conn.getHeaderField("Cache-Control"));
        System.out.println("Expires: " + conn.getHeaderField("Expires"));
        System.out.println("Last-Modified: " + conn.getHeaderField("Last-Modified"));
        System.out.println("ETag: " + conn.getHeaderField("ETag"));
        System.out.println("Content-Encoding: " + conn.getHeaderField("Content-Encoding"));
        System.out.println("Content-Language: " + conn.getHeaderField("Content-Language"));
        System.out.println("Vary: " + conn.getHeaderField("Vary"));
        //
        String resource = "https://www.google.com/";
        URL url1 = new URL(resource);
        URLConnection conn1 = url1.openConnection();
        System.out.println("All Headers:");
        Map<String, List<String>> headerFields = conn1.getHeaderFields();
        Set<String> keys = headerFields.keySet();
        for (String key : keys) {
            List<String> values = headerFields.get(key);
            System.out.print(key + ":");
            for (String value : values) {
                System.out.println(value + "\t");

            }
            System.out.println();

        }
    }
}
