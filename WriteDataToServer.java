import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WriteDataToServer {

    public static void main(String[] args) {
        String urlString = "https://www.twitter.com/";
        String postData = "key1=value1&key2=value2"; // data to send

        HttpURLConnection connection = null;

        try {
            // Create URL object
            URL url = new URL(urlString);
            // Open connection
            connection = (HttpURLConnection) url.openConnection();
            // Set request method to POST
            connection.setRequestMethod("POST");
            // Set request headers
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Accept", "application/json");
            // Enable input and output streams
            connection.setDoOutput(true);
            // Write POST data to output stream
            try (OutputStream os = connection.getOutputStream()) {
                os.write(postData.getBytes("UTF-8"));
                os.flush();
            }

            // Check response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response from the input stream
            StringBuilder response = new StringBuilder();
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
            }

            // Print the response
            System.out.println("Response Message: " + connection.getResponseMessage());
            System.out.println("Response Body: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
