
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class UrlDemo {
    public static void main(String[] args) throws URISyntaxException, IOException {

        String baseUrl = "https://www.geeksforgeeks.org/";
        URI uri = new URI(baseUrl);
        URL url = uri.toURL();

        // Identifying components of URL
        System.out.println("URL: " + url.toString());
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());

        // Opening connection to fetch URL content
        URLConnection conn = url.openConnection();

        // Reading content from the URL
        System.out.println("content of URl:" + url.getContent());
        System.out.println("getcontenttye:" + conn.getContentType());
        System.out.println("connection timeout:" + conn.getConnectTimeout());
        System.out.println("scheme:" + uri.getScheme());
        System.out.println("Authority:" + uri.getAuthority());

        // Additional URI and URL example
        URI uri1 = new URI("https://www.python.org/");
        URL url1 = uri1.toURL();

        // Reading content from the second URL
        URLConnection conn1 = url1.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn1.getInputStream()));
        System.out.println("\nContent from second URL:");
        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            System.out.println(inputLine);
        }
        reader.close();
    }
}
