import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class keyvalue {
    public static void main(String args[]) throws Exception {
        String resource = "https://www.google.com/";
        URL url = new URL(resource);
        URLConnection conn = url.openConnection();
        Map<String, List<String>> headerFields = conn.getHeaderFields();
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
