import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeDecoded {
    public static void main(String[] args) {
        try {
            String str = "sample text!@#$";
            String encodedString = URLEncoder.encode(str, "utf-8");
            System.out.println("Encoded string:" + encodedString);
            String str1 = "sample+text%21%40%23%24";
            String decodedstr = (URLDecoder.decode(str1, "UTF-8"));
            System.out.println("decoded string:" + decodedstr);

        } catch (Exception e) {
        }

    }
}
