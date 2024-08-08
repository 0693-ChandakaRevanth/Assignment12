import java.io.IOException;
import java.nio.file.*;

public class Read_File {
    public static void main(String[] args) throws IOException{
        Path path=Paths.get("input.txt");
            String str=Files.readString(path);
            System.out.println(str);
    }
}
