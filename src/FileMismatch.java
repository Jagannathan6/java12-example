import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {
    public static void main(String args[]) throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1,"Test");
        Files.writeString(filePath2,"Testing");

        long mismatch = Files.mismatch(filePath1, filePath2);

        System.err.println(mismatch);
    }
}
