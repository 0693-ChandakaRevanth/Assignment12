import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
public class Write_File {
    public static void main(String[] args) {
        Path path= Paths.get("write.txt");
        List<String> input= Arrays.asList("This"," is ","the ","input"," data.");
        String str=String.join("",input);
        try{
            Files.writeString(path, str,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("Data Entered into Destination File.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
