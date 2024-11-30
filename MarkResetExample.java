import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class MarkResetExample {
    public static void main(String[] args) {
        // Create a ByteBuffer with a capacity of 10 bytes
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Write data to the buffer
        for (int i = 0; i < 10; i++) {
            buffer.put((byte) i);
        }

        // Prepare buffer for reading
        buffer.flip();

        // Set a mark at the current position (position 4)
        buffer.position(4);
        buffer.mark();

        // Read and print data from the buffer until the mark
        System.out.print("Data up to the mark: ");
        while (buffer.position() < 4) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();

        // Reset the buffer to the marked position
        buffer.reset();

        // Read and print data again from the marked position
        System.out.print("Data after reset: ");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
    }
}
