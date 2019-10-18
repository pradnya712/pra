import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * DemoFileWriter
 */
public class DemoFileWriter {

    public static void main(String[] args) {
        //String content = "India a power country";
        String userInputContent="";

        System.out.println("Enter any String: ");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader br =  new BufferedReader(inputStreamReader);
            userInputContent = br.readLine();
            
        } catch (IOException e) {
           System.out.println(e);
        }
        //System.out.println(userInputContent);
        try {
            FileWriter fileWriter = new FileWriter("info.txt");
            fileWriter.write(userInputContent);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}