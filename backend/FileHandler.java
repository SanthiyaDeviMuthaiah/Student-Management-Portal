
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static void saveStudent(String data) throws IOException{
        FileWriter writer = new FileWriter("students.txt",true);
        writer.write(data + "\n");
        writer.close();
    }
}