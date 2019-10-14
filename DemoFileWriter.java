import java.io.FileWriter;
import java.io.IOException;

/**
 * DemoFileWriter
 */
public class DemoFileWriter {

    public static void main(String[] args) {
        String content = "India a power country";

        try {
            FileWriter fileWriter = new FileWriter("E:/info.txt");
            fileWriter.write(content);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}