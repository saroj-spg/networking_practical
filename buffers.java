import java.nio.ByteBuffer;

public class CompactBufferExample {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Write data to the buffer
        for (int i = 0; i < 5; i++) {
            buffer.put((byte) i);
        }

        // Prepare for reading
        buffer.flip();
        
        // Read some data
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();

        // Prepare buffer for writing more data
        buffer.compact();

        // Write new data
        buffer.put((byte) 5);
        buffer.put((byte) 6);

        // Flip the buffer to prepare for reading
        buffer.flip();
        
        // Read the remaining data
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();
    }
}
